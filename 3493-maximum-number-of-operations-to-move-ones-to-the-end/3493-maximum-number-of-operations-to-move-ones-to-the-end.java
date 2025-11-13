class Solution {
    public int maxOperations(String s) {
        int res = 0;
        int ones = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c == '1') {
                ones++;
            } else{
                if(i == len - 1 || s.charAt(i + 1) == '1') {
                    res += ones;
                }
            }
        }
        return res;
    }
}