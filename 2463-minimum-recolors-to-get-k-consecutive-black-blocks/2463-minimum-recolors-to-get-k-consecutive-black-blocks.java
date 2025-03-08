class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res = Integer.MAX_VALUE;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        // generate window of k size
        for(; i < k; i++) {
            sb.append(blocks.charAt(i));
        }
        res = Math.min(res, countW(sb.toString()));
        // iterate through remaining string
        for(; i < blocks.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(blocks.charAt(i));
            res = Math.min(res, countW(sb.toString()));
        }
        return res;
    }

    private int countW(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == 'W') {
                count++;
            }
        }
        return count;
    }
}