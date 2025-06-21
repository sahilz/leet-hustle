class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int currDiff = target - currNum;

            if(hm.containsKey(currDiff)) {
                return new int[]{hm.get(currDiff), i};
            }

            hm.put(currNum, i);
        }
        return new int[]{};
    }
}