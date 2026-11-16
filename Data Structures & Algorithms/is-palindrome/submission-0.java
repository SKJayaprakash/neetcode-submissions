class Solution {

    public boolean isPalindrome(String s) {
        
        int length = s.length() , start = 0 , end = length - 1 ;

        char[] charray = s.toCharArray();

        while ( start < end ) {

            while ( start < length && ! Character.isLetterOrDigit(charray[start]) ) {
                start++;
            }

            while ( end >= 0 && ! Character.isLetterOrDigit(charray[end]) ) {
                end--;
            }

            if ( start < end ) {
                
                // System.out.println( start +" "+end +" "+ charray[start] +" "+ charray[end] +" "+Character.isLetter( charray[start])+" "+Character.isLetter( charray[end]));

                if ( Character.isLetter( charray[start]) && Character.isLetter( charray[end] )  ) {
                    charray[start] = Character.toLowerCase( charray[start] );
                    charray[end] = Character.toLowerCase( charray[end] );
                }
                // System.out.println( start +" "+end +" "+ charray[start] +" "+ charray[end] +" "+(charray[start] == charray[end]));

                if ( charray[start] != charray[end]  ) {
                    return false;
                }
            }
            start++;
            end--;
        }

        return true;
    }
}
