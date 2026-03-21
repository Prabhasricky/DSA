class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for(int i=0; i<n; i++){
            
            int needed = target - nums[i];
            if(resultMap.containsKey(needed)){
                return new int[] {resultMap.get(needed), i};
            }

            resultMap.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}