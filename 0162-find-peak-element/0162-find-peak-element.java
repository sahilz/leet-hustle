class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int len = nums.length;
        if(nums[0] > nums[1]) return 0;
        if(nums[len - 1] > nums[len - 2]) return len - 1;

        int start = 1;
        int end = len - 2;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid;
            else if (nums[mid] < nums[mid + 1]) start = mid + 1;
            else if (nums[mid] > nums[mid + 1]) end = mid - 1;
        }

        return -1;
    }
}