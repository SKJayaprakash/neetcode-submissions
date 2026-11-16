class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap();

        int length = nums.length , lcs = 0;

        for ( int n : nums ) {
            if ( ! map.containsKey( n ) ) {
                map.put( n , map.getOrDefault(n-1,0) + map.getOrDefault(n+1,0) + 1 );
                map.put( n - map.getOrDefault(n-1,0) , map.get(n) );
                map.put( n + map.getOrDefault(n+1,0) , map.get(n) );

                lcs = Math.max( lcs , map.get(n) );
            }
            
        } 
        return lcs;
    }
}
