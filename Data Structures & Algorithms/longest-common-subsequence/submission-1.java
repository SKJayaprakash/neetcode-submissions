class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        
        char[] charray1 = text1.toCharArray();
        char[] charray2 = text2.toCharArray();
        
        int length1 = charray1.length, length2 = charray2.length,i,j;

        int[][] dp = new int[length1+1][length2+1];

        for ( i = 0 ; i < length1 ; i++ ) {
            for ( j = 0 ; j < length2 ; j++ ) {
                if ( charray1[i] == charray2[j] ) {
                    dp[i+1][j+1] = 1 + dp[i][j];
                } else {
                    dp[i+1][j+1] = Math.max( dp[i][j+1] , dp[i+1][j] );
                }
            }
        }
        return dp[length1][length2];

    }
}
