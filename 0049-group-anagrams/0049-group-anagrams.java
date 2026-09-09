class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> list = new ArrayList<>();
         if(strs.length == 0) return list;
         Map<String,List<String>> map = new HashMap<>();
         for( int i = 0 ; i < strs.length ; i++){
            String og = strs[i];
            char chars[] = og.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(og);
         }
         list.addAll(map.values());
         return list;
    }
}