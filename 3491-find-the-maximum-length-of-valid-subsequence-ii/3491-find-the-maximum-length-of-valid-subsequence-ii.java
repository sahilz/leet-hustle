class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < k; j++) {
                res = Math.max(res, dp[nums[i] % k][j] = dp[j][nums[i] % k] + 1);
            }
        }
        return res;
    }
}