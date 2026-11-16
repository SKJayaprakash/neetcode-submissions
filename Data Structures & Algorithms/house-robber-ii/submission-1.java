class Solution {

    public int helper( int[] nums ) {
        


        int length = nums.length , rob1 = 0 , rob2 = 0 , i,temp;

        for ( i = 0 ; i < length ; i++ ) {

            temp = Math.max( nums[i] + rob1 , rob2 );
            rob1 = rob2;
            rob2 = temp;

        }
        return rob2;
    }

    public int rob(int[] nums) {
        
        if ( nums.length == 1 ) {
            return nums[0];
        }

        return Math.max( helper(Arrays.copyOfRange( nums , 0 , nums.length-1 )) , helper(Arrays.copyOfRange( nums , 1 , nums.length )) );


    }
}
