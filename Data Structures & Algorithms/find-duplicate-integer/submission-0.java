class Solution {
    public int findDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<r; i++){
            if(set.contains(nums[i])){
                return nums[i];            
            }
            else
            set.add(nums[i]);
        }
        return -1;
    }
}
