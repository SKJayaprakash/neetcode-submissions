class Solution {

    public int maxProduct1( int[] nums ) {

        int i,length = nums.length,minProduct = 1 ,  maxProduct = 1, maxGlobal = Integer.MIN_VALUE;

        for ( int num : nums ) {
            
            if ( num == 0 ) {
                minProduct = 1;
                maxProduct = 1;

                maxGlobal = Math.max( maxGlobal , 0 );

                continue;
            }

            int currentProduct = num * maxProduct;
            maxProduct = Math.max( currentProduct , Math.max( num * minProduct , num ) );
            minProduct = Math.min( currentProduct , Math.min( num * minProduct , num ) );

            maxGlobal = Math.max( maxGlobal , maxProduct );

        }
        return maxGlobal;

    }

    public int maxProduct(int[] nums) {
        return maxProduct1(nums);

    }
}
