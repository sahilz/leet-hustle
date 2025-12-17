class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);

        Deque<Integer> dq = new ArrayDeque<Integer>();
        for(int i = 0; i < len * 2; i++) {
            int idx = i % len;
            while(!dq.isEmpty() && nums[dq.peek()] < nums[idx]) {
                res[dq.pop()] = nums[idx];
            }
            if(i < len) {
                dq.push(idx);
            }
        }
        return res;
    }
}