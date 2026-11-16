class Solution {


    public int uniquePaths(int m, int n) { 

        int[] row = new int[n];
        int i,j;
        Arrays.fill( row ,1 );
        for ( i = 0 ; i < m-1 ; i++ ) {

            int[] newRow = new int[n];
            Arrays.fill( newRow ,1 );

            for ( j = n-2 ; j >= 0 ; j-- ) {
                newRow[j] = newRow[j+1] + row[j];
            }
            row = newRow;
        }
        return row[0];
    }
        
}
