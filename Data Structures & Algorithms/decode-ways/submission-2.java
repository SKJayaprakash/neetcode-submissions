class Solution {

    public int numDecodings(String s) {
        
        int length = s.length() , i;

        int[] dp = new int[s.length()+1];

        dp[length] = 1;

        char[] chArray = s.toCharArray();
        for ( i = length-1 ; i >= 0 ; i--  ) {
            
            if ( chArray[i] != '0' ) {

                dp[i] = dp[i+1];
            
                if ( i != length-1 && (( chArray[i] == '1'  ) || ( chArray[i] == '2' && (chArray[i+1] >= '0' && chArray[i+1] < '7' ) ) ) ) {
                    dp[i] += dp[i+2];
                }

            } else {
                dp[i] = 0;
            }
        }

        return dp[0];

 
    }
}
