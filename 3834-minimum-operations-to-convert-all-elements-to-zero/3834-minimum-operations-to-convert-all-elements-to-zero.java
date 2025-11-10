class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int res = 0;
        for(int i : nums) {
            if(i == 0) {
                st.clear();
                continue;
            }
            while(!st.isEmpty() && st.peekLast() > i) {
                st.removeLast();
            }
            if(!st.isEmpty() && st.peekLast() == i) continue;
                st.addLast(i);
                res++;
        }
        return res;
    }
}