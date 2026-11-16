class Solution {

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
