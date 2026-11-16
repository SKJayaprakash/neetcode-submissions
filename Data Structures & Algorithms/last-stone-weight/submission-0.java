class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue( (a,b) -> (Integer) b - (Integer) a );

        for ( int stone : stones ) {
            priorityQueue.add( stone );
        }

        while ( priorityQueue.size() > 1 ) {
            int stone1 = priorityQueue.remove();
            int stone2 = priorityQueue.remove();

            if ( stone1 != stone2 ) {
                priorityQueue.add( Math.abs( stone1 - stone2 ));
            }
        }

        if ( priorityQueue.size() == 1 ) {
            return priorityQueue.remove();
        } else {
            return 0;
        }
    }
}
