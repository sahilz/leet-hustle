class Solution {
//    public int firstStableIndex(int[] nums, int k) {
//        final int len = nums.length;
//        int[] prefMax = new int[len];
//        int[] suffMin = new int[len];
//        calculatePrefMax(prefMax, nums);
//        calculateSuffMin(suffMin, nums);
//        int res = -1;
//        for(int i = 0; i < len; i++) {
//            if(prefMax[i]-suffMin[i] <= k) {
//                res = i;
//                break;
//            }
//        }
//        return res;
//    }
//    private void calculatePrefMax(int[] prefMax, int[] nums) {
//        prefMax[0] = nums[0];
//        for(int i = 1; i < nums.length; i++) {
//            prefMax[i] = Math.max(prefMax[i - 1], nums[i]);
//        }
//    }
//    private void calculateSuffMin(int[] suffMin, int[] nums) {
//        suffMin[nums.length - 1] = nums[nums.length - 1];
//        for(int i = nums.length - 2; i >= 0; i--) {
//            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
//        }
//    }
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