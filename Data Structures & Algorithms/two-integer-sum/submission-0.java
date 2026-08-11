class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();  //stores the number and index;  {(10,0),(20,1),(30,2) ..... }
        
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int comp = target - num;

            if(map.containsKey(comp))
                return new int[] {map.get(comp),i};

            map.put(num, i);
        }
        return new int[] {};
    }                    
}