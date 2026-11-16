class Solution {


    public int climbStairs(int n) {

        int[] stairs = new int[n];

        stairs[0] = 1;


        if ( n == 1 ) {
            return stairs[0];
        }

        stairs[1] = 2;

        if ( n == 2) {
            return stairs[1];
        }
        
        for ( int i = 2 ; i < n ; i++ ) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }   
        return stairs[n-1];
    }
}
