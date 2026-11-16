class Solution {


    public int climbStairs(int n , Map<Integer,Integer> mem ) {
        
        System.out.println( n +" "+ mem );

        if ( mem.containsKey(n) ) {
            return mem.get(n);
        }

        if ( n > 0 ) {
            System.out.println( n +" in1 "+ mem );
            mem.put(n , climbStairs( n-1 , mem ) + climbStairs( n-2, mem ));
            System.out.println( n +" in "+ mem );
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
