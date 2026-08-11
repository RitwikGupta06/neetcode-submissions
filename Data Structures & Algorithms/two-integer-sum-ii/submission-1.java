class Solution {
    public int[] twoSum(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int[] returner = new int[2];

        while (nums[start] + nums[end] != target || start > end) {
            if(nums[start] + nums[end] > target)
                end--;
            else if(nums[start] + nums[end] < target){
                start++;
            }
        }
        returner[0] = start + 1;
        returner[1] = end + 1;
        return returner;
    }
}