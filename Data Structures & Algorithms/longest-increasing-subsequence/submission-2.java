class Solution {
    public int lengthOfLIS(int[] nums) {

        int length = nums.length,i , global = -1001;

        int[] dp = new int[ length ];

        for ( i = 0 ; i < length ; i++ ) {                

            int j = i-1;
            while ( j >= 0  ) {   
                if ( nums[j] < nums[i] ) {
                    dp[i] = Math.max( dp[j]+1 , dp[i] );
                }
                j--;
            }

            // dp[i] = (j == -1) ?  1 : dp[i] ;

            global = Math.max( global , dp[i] );

            System.out.println( Arrays.toString( dp ) );
        }

        return global+1;
    }
}
