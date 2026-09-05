class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;
        int[] suffMin = new int[len];
        suffMin[len - 1] = nums[len - 1];
        for(int i = len - 2; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
        }
        int prefMax = nums[0];
        for(int i = 0; i < len; i++) {
            prefMax = Math.max(prefMax, nums[i]);
            if(prefMax - suffMin[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}