class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int[] count = new int[2];
        int res = n;
        for(int i = 0; i < n; i++){
            count[students[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(count[sandwiches[i]] > 0){
                count[sandwiches[i]]--;
                res--;
            }
            else break;
        }
        return res;
    }
}
