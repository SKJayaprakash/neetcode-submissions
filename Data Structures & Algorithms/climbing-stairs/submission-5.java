class Solution {


    public int climbStairs(int n , Map<Integer,Integer> mem ) {
        
        if ( mem.containsKey(n) ) {
            return mem.get(n);
        }

        if ( n > 0 ) {
            mem.put(n , climbStairs( n-1 , mem ) + climbStairs( n-2, mem ));
            return mem.get(n);
        }

        return 0;
    }    

    public int climbStairs(int n) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put( 0 , 1);
        climbStairs( n , map );

        return map.get(n);
    }
}
