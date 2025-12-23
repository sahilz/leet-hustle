class Solution {
    public int maxTwoEvents(int[][] events) {
        // sorting by end time
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
        int len = events.length;
        int[] endTimes = new int[len];
        int[] prefixMax = new int[len];

        for(int i = 0; i < len; i++) {
            endTimes[i] = events[i][1];
            prefixMax[i] = Math.max(i > 0 ? prefixMax[i - 1] : 0, events[i][2]);
        }
        int res = prefixMax[len - 1];
        for(int i = 0; i < len; i++) {
            int start = events[i][0];
            int val = events[i][2];
            int idx = binarySearch(endTimes, start);
            if(idx != -1) {
                res = Math.max(res, val + prefixMax[idx]);
            }
        }
        return res;
    }

    private int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < target) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}