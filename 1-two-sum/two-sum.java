class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> resMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            if(resMap.containsKey(needed)){
                return new int[]{resMap.get(needed), i};
            }
            resMap.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}