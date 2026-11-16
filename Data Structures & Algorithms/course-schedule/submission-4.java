class Solution {

    public boolean isCyclic( int currentNode , List<List<Integer>> adjList , int[] visited, int[] dfsVisited ) {
        
        visited[currentNode] = 1;
        dfsVisited[currentNode] = 1;

        for ( int neighbor : adjList.get(currentNode) ) {
            if ( dfsVisited[neighbor] == 1 ) {
                return true;
            } else {
                return isCyclic( neighbor , adjList , visited , dfsVisited );
            }
        }
        dfsVisited[currentNode] = 0;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjList = new ArrayList();
        
        for ( int i = 0 ; i < numCourses ; i++ ) {
            adjList.add( new ArrayList() );
        }

        for ( int[] prerequisite : prerequisites ) {

            int src = prerequisite[0];
            int dest = prerequisite[1];

            adjList.get( src ).add( dest );

            
        }
        System.out.println( adjList );

        int[] visited;
        int[] dfsVisited;

        visited = new int[numCourses];
        dfsVisited = new int[numCourses];

        for ( int i = 0 ; i < numCourses ; i++ ) {
            if ( visited[i] == 0 ) {
                boolean isC = isCyclic( i , adjList , visited , new int[numCourses] );
                if ( isC ) {
                    return false;
                }
                
            }
        }
        return true; 

    }
}
