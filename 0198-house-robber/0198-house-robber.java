class Solution {
    public int rob(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++) {
            int curr = sum2 + nums[i];
            sum2 = Math.max(sum2, sum1);
            sum1 = curr;
        }
        return Math.max(sum1, sum2);
    }
}