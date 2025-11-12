class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int globalGcd = nums[0];
        int ones = 0;
        int minLen = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            globalGcd = gcd(globalGcd, nums[i]);
            if (globalGcd == 1) break;
        }
        if (globalGcd > 1) return -1;
        for (int v : nums) if (v == 1) ones++;
        if (ones > 0) return n - ones;
        for (int i = 0; i < n; i++) {
            int g = 0;
            for (int j = i; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return n + minLen - 2;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
