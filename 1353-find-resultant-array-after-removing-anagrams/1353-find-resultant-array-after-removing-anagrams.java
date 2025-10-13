class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for(String s : words) {
            if(res.isEmpty()) {
                res.add(s);
            } else {
                String prev = res.get(res.size() - 1);
                if(!isAnagram(prev, s)) {
                    res.add(s);
                }
            }
        }
        return res;
    }
    private boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }
}