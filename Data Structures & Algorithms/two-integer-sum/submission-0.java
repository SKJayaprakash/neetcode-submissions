class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indicies = new int[2];

        Map<Integer,Integer> map = new HashMap();

        int length = nums.length;

        for ( int i = 0 ; i < length ; i++) {
            if ( map.containsKey( target - nums[i] ) ) {
                indicies[0] = map.get( target - nums[i] );
                indicies[1] = i;
                break;
            }
            map.put( nums[i] , i );
        }

        return indicies;
    }
}
