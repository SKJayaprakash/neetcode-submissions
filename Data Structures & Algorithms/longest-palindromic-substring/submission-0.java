class Solution {
    public String longestPalindrome(String s) {
        
        String resultString = "";
        int longestLength = 0 , right = 0 ,left = 0 , length = s.length() , i;

        for ( i = 0 ; i < length ; i++ ) {

            left = i;
            right = i+1;

            int currentLength;

            while ( ( left >= 0 ) && ( right < length ) && s.charAt( right ) == s.charAt( left ) ) {

                currentLength = right - left + 1;

                // System.out.println( longestLength+" "+currentLength+" "+s.substring( left , right + 1 ) );

                if ( currentLength > longestLength ) {
                    longestLength = currentLength;
                    resultString = s.substring( left , right + 1 );
                }

                left--;
                right++;

            }

            left = i;
            right = i;

            while ( ( left >= 0 ) && ( right < length ) && s.charAt( right ) == s.charAt( left ) ) {

                
                currentLength = right - left + 1;
                // System.out.println( " "+longestLength+" "+currentLength+" "+s.substring( left , right + 1 ) );
                if ( currentLength > longestLength ) {
                    longestLength = currentLength;
                    resultString = s.substring( left , right + 1 );
                }

                left--;
                right++;
            }
        }
        return resultString;
    }

}
