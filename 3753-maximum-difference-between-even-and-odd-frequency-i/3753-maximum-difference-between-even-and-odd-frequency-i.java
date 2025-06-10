class Solution {
    public int maxDifference(String s) {
        // Generate frequency map
        int[] arr = new int[26];
        int max = 0;
        int min = s.length();
        for(char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        // Find max odd and min even
        for(int i : arr) {
            if(i % 2 == 0) {
                min = Math.min(i == 0 ? s.length() : i, min);
            } else {
                max = Math.max(max, i);
            }
        }
        return max - min;
    }
}