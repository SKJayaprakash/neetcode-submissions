class Solution {

    public void dfs( char[][] grid , int i , int j , int m , int n ) {
        // System.out.println( i+" "+j );
        if ( i >= 0 && i < m && j >= 0 && j < n ) {
            if ( grid[i][j] == '1' ) {

                grid[i][j] = '0';
                dfs( grid, i+1 , j , m , n );
                dfs( grid , i , j + 1 , m , n );
                dfs( grid , i - 1 , j , m , n );
                dfs( grid  , i , j - 1 , m , n );
            }
        }
    }

    public int numIslands(char[][] grid) {
        
        int m = grid.length , n = grid[0].length , i , j , noOfIsland = 0;

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
