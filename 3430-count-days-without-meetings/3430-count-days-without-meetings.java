class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for(int[] i : meetings) {
            if(merged.isEmpty() || i[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(i);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], i[1]);
            }
        }
        int res = 0;
        for(int[] i : merged) {
            res += (i[1] - i[0] + 1);
        }
        return days - res;
    }
}