class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums) {
            hs.add(i);
        }
        int len = nums.length;
        int k = hs.size();
        int res = 0;
        int i = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for(int j = 0; j < len; j++) {
            if(count.getOrDefault(nums[j], 0) == 0) {
                k--;
            }
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            while(k == 0) {
                count.put(nums[i], count.get(nums[i]) - 1);
                if(count.get(nums[i]) == 0) {
                    k++;
                }
                i++;
            }
            res += i;
        }
        return res;
    }
}