class Solution {
    public int rob(int[] nums) {
        
        int length = nums.length,i , rob1 = 0,rob2 = 0 , temp;

        for ( i = 0 ; i < length ; i++) {
            temp = Math.max( nums[i] + rob1 , rob2  );
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;

    }
}
