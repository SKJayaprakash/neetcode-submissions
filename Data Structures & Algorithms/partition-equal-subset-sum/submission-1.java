class Solution {

    // public boolean helper( int[] nums , int targetSum , int currentSum ) {
        
    //     if ( targetSum == currentSum ) {
    //         return true;
    //     }


    //     if ( nums.length == 0 ) {
    //         return false;
    //     }

    //     boolean inc = helper( Arrays.copyOfRange( nums , 1, nums.length ) , targetSum , currentSum );
    //     boolean notInc = helper( Arrays.copyOfRange( nums , 1, nums.length ), targetSum , currentSum+nums[0]);

    //     return inc || notInc;

    // }

    public boolean canPartition(int[] nums) {
        
        int length = nums.length , totalSum = 0 , i;

        Set<Integer> dp = new HashSet<Integer>();
        Set<Integer> nextdp;
        dp.add(0);

        for ( Integer num : nums ) {
            totalSum += num;
        }

        if ( totalSum % 2 == 0 ) {
            
            for ( i = length - 1 ; i >= 0 ; i-- ) {

                nextdp = new HashSet<Integer>();

                for ( Integer t : dp ) {

                    if ( t+nums[i] == (totalSum / 2) ) {
                        return true;
                    }
                    nextdp.add(t);
                    nextdp.add(t+nums[i]);
                }
                dp = nextdp;
            }
        }
        return false;
       
    }
}
