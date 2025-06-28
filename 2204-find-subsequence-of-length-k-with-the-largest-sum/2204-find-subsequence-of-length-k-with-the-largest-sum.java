class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] tempArr = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            tempArr[i] = new int[]{nums[i], i};
        }
        // Sort according to the values
        Arrays.sort(tempArr, (a, b) -> b[0] - a[0]);

        // Sort according to indexes
        Arrays.sort(tempArr, 0, k, (a, b) -> a[1] - b[1]);

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = tempArr[i][0];
        }
        return res;
    }
}