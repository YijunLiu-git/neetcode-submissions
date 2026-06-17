class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], curSum = 0;
        for(int i : nums){
            if(curSum<0){
                curSum =0;
            }
            curSum+=i;
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
