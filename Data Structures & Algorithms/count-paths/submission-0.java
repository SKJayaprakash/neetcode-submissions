class Solution {

    int noOfPath;

    void path( int i , int j , int m , int n ) {

        if ( i < m && i >= 0 && j < n && j >= 0 ) {

            if ( i == m - 1 && j == n - 1 ) {
                noOfPath++;
            }

            path( i+1,j , m , n );
            path( i,j+1 , m , n );
        }

    }

    public int uniquePaths(int m, int n) {
        
        noOfPath = 0;

        path( 0 , 0 , m , n );

        return noOfPath;
    }
}
