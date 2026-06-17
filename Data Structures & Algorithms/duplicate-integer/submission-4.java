class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}