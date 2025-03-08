class Solution {
    public int minimumRecolors(String blocks, int k) {
        int countW = 0;
        int res;
        // count W
        for (int i = 0; i < k; i++) {
            if(blocks.charAt(i) == 'W') countW++;
        }
        res = countW;
        // slide window across string
        for(int i = k; i < blocks.length(); i++) {
            if(blocks.charAt(i) == 'W') countW++;       // add new
            if(blocks.charAt(i - k) == 'W') countW--;   // remove old
            res = Math.min(res, countW);
        }
        return res;
    }
}