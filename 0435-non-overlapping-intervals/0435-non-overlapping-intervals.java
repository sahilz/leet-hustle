class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        final int len = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prev = 0;
        int count = 1;

        for(int i = 1; i < len; i++) {
            if(intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count++;
            }
        }
        return len - count;
    }
}