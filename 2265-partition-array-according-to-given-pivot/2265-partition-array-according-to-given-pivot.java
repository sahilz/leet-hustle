class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        for(int i : nums) {
            if(i < pivot) {
                small.add(i);
            } else if (i > pivot) {
                big.add(i);
            } else {
                equal.add(i);
            }
        }
        res = IntStream.concat(
                                  IntStream.concat(small.stream().mapToInt(i -> i), 
                                                   equal.stream().mapToInt(i -> i)),
                                  big.stream().mapToInt(i -> i))
                              .toArray();
        return res;
    }
}