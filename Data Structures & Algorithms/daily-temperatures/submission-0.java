class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int length = temperatures.length;

        int[] res = new int[length];


        for ( int i = length - 2 ; i >= 0 ; i--) {

            int j = i + 1;

            while ( j < length && temperatures[j] <= temperatures[i] ) {
                if ( res[j] == 0 ) {
                    j = length;
                    break;
                }
                j += res[j];

            }

            if ( j < length ) {
                res[i] = j-i;
            }
        }

        return res;
    }
}
