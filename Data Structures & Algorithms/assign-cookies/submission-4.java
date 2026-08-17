class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int sat = 0;
        int greed = 0;
        int size = 0;

        Arrays.sort(g);
        Arrays.sort(s);
        while(greed < g.length && size < s.length){
            if(s[size] >= g[greed]){
                size++;
                greed++;
                sat++;
            } else {
                size++;
            }
        }
        return sat;

    }
}