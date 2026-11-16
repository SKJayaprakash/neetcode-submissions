class Solution {
    public int countSubstrings(String s) {
        
        int length = s.length() , i , j , left , right , noOfPallindromicSubstrings = 0;
        char[] charArray = s.toCharArray();
        

        for ( i = 0 ; i < length ; i++ ) {

            left = i;
            right = i;

            while ( left >= 0 && right < length && charArray[left] == charArray[right] ) {
                left--;
                right++;
                noOfPallindromicSubstrings++;
            }

            left = i;
            right = i+1;

            while ( left >= 0 && right < length && charArray[left] == charArray[right] ) {
                left--;
                right++;
                noOfPallindromicSubstrings++;
            }
        }
        return noOfPallindromicSubstrings;

    }
}
