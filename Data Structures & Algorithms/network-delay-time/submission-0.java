class Solution {

    class Edge {
        int to;
        int weight;

        Edge( int to , int weight ) {
            this.to = to;
            this.weight = weight;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        
        List<List<Edge>> graph = new ArrayList();

        for ( int i = 0 ; i < n ; i++ ) {
            graph.add( new ArrayList() );
        }
        
        for ( int[] time : times ) {
            graph.get(time[0]-1).add( new Edge( time[1]-1 , time[2] ) );
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>( Comparator.comparingInt( a -> a[1] ) );

        int[] dist = new int[n];

        Arrays.fill( dist , Integer.MAX_VALUE );

        dist[k-1] = 0;

        pq.offer( new int[]{ k-1 , 0 } );

        while ( ! pq.isEmpty() ) {

            int[] curr = pq.poll();

            int u = curr[0];
            int d = curr[1];

            if ( d > dist[u] ) continue;

            for ( Edge edge : graph.get(u) ) {
                
                int v = edge.to;
                int w = edge.weight;

                if ( dist[u] + w < dist[v] ) {
                    dist[v] = dist[u] + w;

                    pq.offer( new int[]{v , dist[v]} );
                }
            }

        }
        
        int minDistance = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( minDistance < dist[i] ) {
                minDistance = dist[i];
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance ;
    }
}
