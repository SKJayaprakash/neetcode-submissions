class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue( (a,b) -> (Integer) b - (Integer) a );
        this.k = k;
        for ( int num : nums ) {
            pq.add( num );
        }
    }
    
    public int add(int val) {
        pq.add(val);

        Iterator<Integer> iterate = pq.iterator();

        ArrayList<Integer> list = new ArrayList();

        int i = 0 , result = 0;

        // System.out.println( pq );

        while( iterate.hasNext()) {
            list.add(iterate.next());
        }
        
        i =  0;

        while( i < list.size() ) {
            if ( i < k ) {
                result = pq.remove();
            } else {
                pq.remove();
            }
            
            i++;
        }

        for ( int num : list ) {
            pq.add( num );
        }

        return result;
    }
}
