class Solution {

    public boolean dfs( int currentNode , int parent , List<List<Integer>> adjList , Set<Integer> visited ) {   

        if ( visited.contains(currentNode) ) {
            return false;
        }

        visited.add( currentNode );

        for ( int n : adjList.get(currentNode) ) {
            if ( n == parent ) {
                continue;
            }
            if ( ! dfs( n , currentNode , adjList , visited ) ) {
                return false;
            }
        }
        return true;
    }

    public boolean validTree(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList();
        
        for ( int i = 0 ; i < n ; i++ ) adjList.add( new ArrayList() );

        for ( int[] edge : edges ) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet();
        
        boolean hasCycle;

        System.out.println( adjList );

        if ( ! dfs( 0, -1 , adjList , visited ) ) {
            return false;
        }
        System.out.println( visited );
        return visited.size() == n;

    }
}
