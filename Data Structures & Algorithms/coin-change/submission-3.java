class Solution {

    public int coinChange(int[] coins, int amount) {
        
        int[] amounts = new int[amount+1];
        int i = 0;

        Arrays.fill( amounts , 1002 );

        amounts[0] = 0;
        for ( i = 1 ; i <= amount ; i++ ) {
            for ( int coin : coins ) {
                if ( (i-coin >= 0) && 1 + amounts[i - coin] < amounts[i] ) {
                    amounts[i] = 1 + amounts[i - coin];
                }
            }
        }
        System.out.println(Arrays.toString(amounts));
        return amounts[amount] == 1002 ? -1 : amounts[amount] ;
    }
}
