class Solution {
    

    public boolean wordBreak(String s, List<String> wordDict) {
        
        int length = s.length(),i;

        boolean[] dp = new boolean[length];    

        for ( i = 0 ; i < length ; i++ ) {
            for ( String word : wordDict ) {
            

                // System.out.println( i+" "+(i - word.length()+1) );

                if ( i - word.length()+1 >= 0 && i <= length ) {

                    // System.out.println(  s.substring( i-word.length()+1 , i+1 ) +" "+word +" "+(s.substring( i-word.length()+1 , i+1 ).equals( word))) ;

                    if ( i-word.length()+1 == 0 && s.substring( i-word.length()+1 , i+1 ).equals( word) ) {
                        dp[i] = true;
                    } else if ( i-word.length() >= 0 && dp[ i - word.length() ] && s.substring( i-word.length()+1 , i+1 ).equals( word) ) {
                        dp[i] = true;
                    }
                }
                // System.out.println( Arrays.toString(dp ) );
                // System.out.println();

            }
        }

        return dp[length-1];

    }   
}
