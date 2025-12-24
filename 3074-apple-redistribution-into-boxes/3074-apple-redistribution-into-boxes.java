class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int i : apple) {
            total += i;
        }
        Arrays.sort(capacity);       
        int res = 0;
        int idx = capacity.length - 1;
        while(total > 0) {
            res++;
            total = total - capacity[idx--];
        }
        return res;
    }
}