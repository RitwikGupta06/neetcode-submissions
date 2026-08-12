class Solution {
    public int findMin(int[] nums) {
       int l = 0;
       int r = nums.length - 1;
       int m = (l+r) / 2;
       int min = nums[0];

       while (l <= r){
            m = (l + r)/2;
            min = Math.min(min, nums[l]);
            if(nums[l] < nums[r]){  
                return min;
            }
            min = Math.min(min, nums[m]);
            if(nums[r] <= nums[m]) 
                l = m + 1;
            else 
                r = m;
       }
        return min;
    }
}

// [1,2,3,4,5,6]

// [] 
