class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> sHMap = new HashMap<>();
        HashMap<Character, Integer> tHMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sHMap.put(s.charAt(i), sHMap.getOrDefault(s.charAt(i), 0) + 1);
            tHMap.put(t.charAt(i), tHMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sHMap.equals(tHMap);
    }
}