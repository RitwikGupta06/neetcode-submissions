class Solution {
    public String longestCommonPrefix(String[] strs) {
        int N = strs.length;
        if(N==0) return "";
        String res = "";
        
        Arrays.sort(strs);
        String N1 = strs[0];
        String N2 = strs[N-1];
        
        for(int i = 0; i < Math.min(N1.length(),N2.length()); i++){
            if(strs[0].charAt(i) == strs[N-1].charAt(i)){
                res += strs[0].charAt(i);
            }
            else return res;
        }
        return res;
    }
}