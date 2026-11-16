class Solution {

    public int numDecodings(String s) {
        
        if ( s.length() == 0 ) {
            return 1;
        }

        if ( s.charAt(0) == '0' ) {
            return 0;
        }

        if ( s.length() == 1 ) {
            return 1;
        }


        int no = Integer.parseInt( (s.charAt(0)+"") + (s.charAt(1) + "" ) );

        int n1 = numDecodings( s.substring(1) );
        int n2 = 0;
        // System.out.println( s.substring(1)+" "+n1 );

        if ( no <= 26 ) {
            n2 = numDecodings( s.substring(2) );
            // System.out.println( s.substring(2)+" "+n2 );
        }
    
        return n1 + n2;
 
    }
}
