class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] - nums[j] > 1) {
                j++;
            }
            if(nums[i] - nums[j] == 1) {
                res = Math.max(res, i - j + 1);
            }
        }
        return res;
    }
}