class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i : nums) {
            if(hs.contains(i)) {
                res.add(i);
            }
            hs.add(i);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}