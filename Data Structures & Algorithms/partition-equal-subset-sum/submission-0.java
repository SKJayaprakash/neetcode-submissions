class Solution {

    public boolean helper( int[] nums , int targetSum , int currentSum ) {
        
        if ( targetSum == currentSum ) {
            return true;
        }


        if ( nums.length == 0 ) {
            return false;
        }

        boolean inc = helper( Arrays.copyOfRange( nums , 1, nums.length ) , targetSum , currentSum );
        boolean notInc = helper( Arrays.copyOfRange( nums , 1, nums.length ), targetSum , currentSum+nums[0]);

        return inc || notInc;

    }

    public boolean canPartition(int[] nums) {
        
        int length = nums.length;
        int totalSum = 0;

        for ( int num : nums ) {
            totalSum += num;
        }

        if ( totalSum % 2 == 0 ) {
            return helper( nums , totalSum/2 , 0 );
        } else {
            return false;
        }

    }
}
