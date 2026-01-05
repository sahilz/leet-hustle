class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            if(hasFourDivisors(i)) {
                sum += sumOfDivisors(i);
            }
        }
        return sum;
    }
    private boolean hasFourDivisors(int i) {
        List<Integer> list = getDivisors(i);
        return list.size() == 4;
    }
    private List<Integer> getDivisors(int num) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i*i <= num; i++) {
            if(num % i == 0) {
                list.add(i);
                if(i != num / i) {
                    list.add(num / i);
                }
            }
        }
        return list;
    }
    private int sumOfDivisors(int num) {
        List<Integer> list = getDivisors(num);
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}