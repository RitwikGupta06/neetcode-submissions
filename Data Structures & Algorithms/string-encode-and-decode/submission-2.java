class Solution {

    public String encode(List<String> strs) {
        String Ncode = "";
        for(String s : strs){
            Ncode += s + "₹";
        }
        return Ncode;
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>();
        int i = 0;
        String s = "";
        while(i<str.length()){
            
            if(str.charAt(i) != '₹'){
                s += str.charAt(i);
            }
            else{
                strList.add(s);
                s = "";
            }
            i++;
        }
        return strList;
    }
}
