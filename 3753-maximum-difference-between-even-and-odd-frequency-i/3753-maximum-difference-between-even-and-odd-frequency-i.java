class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        // Generate Frequency map
        for(char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        // Find the max odd and min even
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(char c : hm.keySet()) {
            if(hm.get(c) % 2 == 0) {
                min = Math.min(min, hm.get(c));
            } else {
                max = Math.max(max, hm.get(c));
            }
        }
        return max - min;
    }
}