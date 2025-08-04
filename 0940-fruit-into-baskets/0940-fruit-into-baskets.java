class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int res = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < fruits.length; i++) {
            hm.put(fruits[i], hm.getOrDefault(fruits[i], 0) + 1);

            while(hm.size() > 2) {
                hm.put(fruits[left], hm.get(fruits[left]) - 1);
                if(hm.get(fruits[left]) == 0) {
                    hm.remove(fruits[left]);
                }
                left++;
            }

            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}