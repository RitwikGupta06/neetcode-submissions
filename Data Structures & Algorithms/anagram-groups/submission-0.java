class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String Word : strs){
            char[] chars = Word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(Word);
        }
        return new ArrayList<>(map.values());
    }
}
