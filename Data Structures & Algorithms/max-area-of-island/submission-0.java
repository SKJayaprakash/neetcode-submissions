class Solution {

    public int dfs( int[][] grid , int i , int j , int m , int n ) {
        // System.out.println( i+" "+j );
        if ( i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + dfs( grid, i+1 , j , m , n ) + dfs( grid , i , j + 1 , m , n ) + dfs( grid , i - 1 , j , m , n ) + dfs( grid  , i , j - 1 , m , n );
        }
        return 0;
    }


    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length , n = grid[0].length , i , j , maxArea = 0;

        for ( i = 0 ; i < m ; i++ ) {
            for ( j = 0 ; j < n ; j++ ) {
                if ( grid[i][j] == 1 ) {
                    int currArea = dfs( grid , i , j , m , n );

                    // System.out.println( currArea+" "+maxArea );

                    maxArea = ( currArea > maxArea ) ? currArea : maxArea ;
                }
            }
        }
        return maxArea;

    }
}
