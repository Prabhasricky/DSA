class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //Sort the array
        Arrays.sort(nums);

        //Initial closestSum
        int closestSum = nums[0] + nums[1] + nums[2];

        //fix one value so that find the closest to the |sum - target|
        for(int i=0; i<nums.length-2; i++){

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                //update the closest
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }

                if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
    }
}