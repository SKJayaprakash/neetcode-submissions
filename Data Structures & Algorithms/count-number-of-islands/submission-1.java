class Solution {

    public void dfs( char[][] grid , int i , int j, int rows , int columns ) {

        if ( i >= 0 && i < rows  && j >= 0 && j < columns && grid[i][j] == '1' ) {
            grid[i][j] = '0';

            dfs( grid , i+1 , j , rows , columns );
            dfs( grid , i , j+1 , rows , columns );
            dfs( grid , i-1 , j , rows , columns );
            dfs( grid , i , j-1 , rows , columns );
        }
    }

    public int numIslands(char[][] grid) {
        
        int i, j, m = 0, n = 0 , noOfIsland = 0;

        m = grid.length;
        
        if ( m > 0 ) {
            n = grid[0].length;
        }

        for ( i = 0 ; i < m ; i++ ) {
            for ( j = 0 ; j < n ; j++ ) {
                if ( grid[i][j] == '1' ) {
                    noOfIsland++;
                    dfs( grid , i , j , m , n );
                }
            }
        }
        return noOfIsland;
    }
}
