class Solution {
    public boolean isAnagram(String s, String t) {

        int[] alphabets = new int[26];

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        for ( char ch : charArray1 ) {
            alphabets[ch-'a']++;
        }

        for ( char ch : charArray2 ) {
            alphabets[ch-'a']--;
        }

        for ( int i : alphabets ) {
            if ( i != 0 ) {
                return false;
            }
            
        }
        return true;
    }
}
