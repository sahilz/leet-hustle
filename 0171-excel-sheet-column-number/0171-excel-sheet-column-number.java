class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null) return -1;
        int res = 0;
        for(char c : columnTitle.toUpperCase().toCharArray()) {
            res *= 26;
            res += c - 'A' + 1;
        }
        return res;
    }
}