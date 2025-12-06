class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxNumber = 0;

        for(int i=0; i<n; i++){
            if(i > maxNumber){
                return false;
            }

            int currentNumber = i + nums[i];

            if(currentNumber > maxNumber){
                maxNumber = currentNumber;
            }

            if(maxNumber > n-1){
                return true;
            }
        }

        return true;
    }

}