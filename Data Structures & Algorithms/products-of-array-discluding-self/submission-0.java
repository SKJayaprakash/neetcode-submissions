class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int length = nums.length;

        int[] output = new int[length];
        
        output[0] = 1;

        for ( int i = 1 ; i < length ; i++ ) {
            output[i] = output[i-1] * nums[i-1];
        }
        
        int rightProduct = 1;

        for ( int i = length - 2 ; i >= 0 ; i-- ) {
            rightProduct *= nums[i+1];
            output[i] *= rightProduct;
        }

        return output;

    }
}  
