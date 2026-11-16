class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        int length = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for ( int n : nums ) {
            if ( max < n ) {
                max = n;
            }
        }

        for ( int n : nums ) {
            if ( min > n ) {
                min = n;
            }
        }

        int[] freqArray = new int[ max-min+1 ];

        for ( int n : nums ) {
            freqArray[n - min]++;
        }


        ArrayList<Integer>[] listArray = new ArrayList[length];


        for ( int i = 0 ; i < freqArray.length ; i++ ) {
            if ( freqArray[i] > 0 ) {
                if ( listArray[freqArray[i]-1] == null ) {
                    listArray[freqArray[i]-1] = new ArrayList();
                }
                listArray[freqArray[i]-1].add( min+i );
            }
            
        }

        for ( int i = length-1 ; i >= 0 ; i-- ) {
            if ( listArray[i] != null ) {
                
                int l = listArray[i].size();

                for ( int j = 0 ; j < l ; j++ ) {
                    if ( k > 0 ) {
                        result[k-1] = listArray[i].get(j);
                        k--;
                    } else {
                        break;
                    }
                }

            }
        }

        for ( ArrayList a : listArray ) {
            System.out.println( a );
        }

        return result;

    }
}
