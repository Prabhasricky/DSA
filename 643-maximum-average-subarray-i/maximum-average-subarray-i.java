class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;

        //first window sum
        while(right < k){
            sum += nums[right];
            right++;
        }

        int maxSum = sum;

        //silde the window
        while(right < n){
            sum += nums[right];
            sum -= nums[left];

            maxSum = Math.max(maxSum, sum);

            left++;
            right++;
        }

        return (double) maxSum / k;
    }
}