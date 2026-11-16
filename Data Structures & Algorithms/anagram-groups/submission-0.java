class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap();


        for ( String string : strs ) {

            char[] charArray = string.toCharArray();

            Arrays.sort( charArray );

            String str = new String(charArray);

            if ( map.containsKey(str) ) {
                map.get(str).add( string );
            } else {
                map.put( str , new ArrayList() {{
                    add( string );
                }} ); 
            }

        }

        return map.values().stream().collect(Collectors.toList());

    }
}
