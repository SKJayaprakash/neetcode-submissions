class Solution {

    // public boolean isCyclic( int currentNode , List<List<Integer>> adjList , int[] visited, int[] dfsVisited ) {
        
    //     visited[currentNode] = 1;
    //     dfsVisited[currentNode] = 1;

    //     boolean isC = false;

    //     System.out.println( "Current Node "+currentNode+adjList.get(currentNode) );
    //     for ( int neighbor : adjList.get(currentNode) ) {
    //         System.out.println( currentNode +" "+neighbor+" "+Arrays.toString(dfsVisited) );
    //         if ( dfsVisited[neighbor] == 1 ) {
    //             isC = true;
    //         } else {
    //             isC = isCyclic( neighbor , adjList , visited , dfsVisited );
    //         }
    //     }
    //     dfsVisited[currentNode] = 0;
    //     return isC;
    // }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adjList = new ArrayList();
        
        int[] indegree = new int[numCourses];

        for ( int i = 0 ; i < numCourses ; i++ ) {
            adjList.add( new ArrayList() );
        }

        for ( int[] prerequisite : prerequisites ) {

            int dest = prerequisite[0];
            int src = prerequisite[1];

            adjList.get( src ).add( dest );
            indegree[dest]++;    
        }
        // System.out.println( adjList );
        // int[] visited;
        // int[] dfsVisited;

        // visited = new int[numCourses];
        // dfsVisited = new int[numCourses];

        // for ( int i = 0 ; i < numCourses ; i++ ) {
        //     if ( visited[i] == 0 ) {
        //         System.out.println( "Check "+i);
        //         boolean isC = isCyclic( i , adjList , visited , new int[numCourses] );
        //         if ( isC ) {
        //             return new int[0];
        //         }
                
        //     }
        // }


        Queue<Integer> queue = new ArrayDeque();

        for ( int i = 0 ; i < numCourses ; i++ ) {
            if ( indegree[i] == 0 ) {
                queue.offer(i);
            }
        }

        int[] validOrder = new int[numCourses];

        int j = 0;

        while ( queue.size() > 0 ) {

            int current = queue.poll();
            
            validOrder[j++] = current;

            for ( int n : adjList.get(current) ) {
                if ( --indegree[n] == 0 ) {
                    queue.offer( n );
                }
            }   

        }

        return j == numCourses ? validOrder : new int[0];

    }
}
