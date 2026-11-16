class Solution {

    public void dfs( int current, List<List<Integer>> adjList , boolean[] visited ) {

        visited[current] = true;

        for ( Integer adjNode : adjList.get(current) ) if ( ! visited[adjNode] ) dfs( adjNode , adjList , visited );

    }

    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList();

        for ( int i = 0 ; i <n ; i++ ) adjList.add( new ArrayList() );

        for ( int[] edge : edges ) {
            adjList.get( edge[0]).add(edge[1]);
            adjList.get( edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        int numberOfConnectedComponents = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            // System.out.println( i +" "+ Arrays.toString(visited) );
            if ( ! visited[i] ) {
                numberOfConnectedComponents++;
                dfs( i , adjList , visited );
            }
        }

        return numberOfConnectedComponents;
    }
}
