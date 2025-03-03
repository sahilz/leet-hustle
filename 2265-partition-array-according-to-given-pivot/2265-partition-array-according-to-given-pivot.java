class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int left = 0;
        int count = 0;

        for(int i : nums) {
            if(i < pivot) {
                res[left++] = i;
            } else if (i == pivot) {
                count++;
            }
        }
        while(count-->0) {
            res[left++] = pivot;
        }
        for(int i : nums) {
            if(i > pivot) {
                res[left++] = i;
            }
        }
        return res;
    }
}