class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;

        //first uniqueIndex
        int startUniqueIndex = 0;

        for(int index = 1; index < n; index++){
            if(nums[index] != nums[startUniqueIndex]){
                startUniqueIndex++;
                nums[startUniqueIndex] = nums[index];
            }
        }

        return startUniqueIndex + 1;
    }
} 