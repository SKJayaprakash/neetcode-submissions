class Solution {
    public boolean hasDuplicate(int[] nums) {

        int length = nums.length;

        Set<Integer> set = new HashSet<>();

        for ( int num : nums ) {
            if ( set.contains(num) ) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
