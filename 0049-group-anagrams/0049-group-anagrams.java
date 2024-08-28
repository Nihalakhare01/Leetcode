class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String strval = String.valueOf(ch);

            if(!map.containsKey(strval)){
                map.put(strval, new ArrayList<>());
            }
            
            map.get(strval).add(str);
        }

        return new ArrayList<>(map.values());
    }
}