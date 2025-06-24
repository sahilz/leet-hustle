class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int r = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if (nums[i] == key) {
                int l = Math.max(r, i - k);
                r = Math.min(len - 1, i + k) + 1;
                for(int j = l; j < r; ++j) {
                    res.add(j);
                }
            }
        }
        return res;
    }
}