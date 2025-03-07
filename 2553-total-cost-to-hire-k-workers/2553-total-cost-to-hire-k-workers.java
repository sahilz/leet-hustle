class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int len = costs.length;
        long res = 0;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int start = 0, end = len - 1;
        // Adding left side
        for(; start < candidates && start < len; start++){
            left.offer(costs[start]);
        }
        // Adding right side
        while (end >= Math.max(len - candidates, start)) {
            right.offer(costs[end--]);
        }
        // hiring low cost worker in k rounds
        for(int i = 0; i < k; i++) {
            if(!left.isEmpty() && (right.isEmpty() || left.peek() <= right.peek())) {
                res += left.poll();
                if(start <= end) {
                    left.offer(costs[start++]);
                }
            } else {
                res += right.poll();
                if(start <= end) {
                    right.offer(costs[end--]);
                }
            }
        }
        return res;
    }
}