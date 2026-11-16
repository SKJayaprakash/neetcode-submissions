class Solution {

    public String encode(List<String> strs) {

        String encoded = "";

        for ( String str : strs ) {
            encoded += "("+Integer.toString(str.length())+")"+str;
        }
        System.out.println( encoded );
        return encoded;
    }

    public List<String> decode(String str) {

        char[] charArr = str.toCharArray();

        List<String> strs = new ArrayList();
        
        int i = 0;

        while ( true ) {
            
            if ( i == str.length() ) {
                break;
            }
            
            int length = 0;


            if ( charArr[i++] == '(' ) {
                
                int j = 0;
                while ( charArr[i] != ')' ) {
                    length = (int)( length * Math.pow(10,1) ) + (charArr[i]-'0');
                    // System.out.println("Length "+length);
                    i++;
                }
                i++;
                // System.out.println(length);

                String st = "";
                
                j = 0;

                while ( j++ < length ) {
                    st += ( charArr[i++] + "" );
                }
                strs.add( st );
                // System.out.println( strs );
            }
        }


        return strs;
    }
}
