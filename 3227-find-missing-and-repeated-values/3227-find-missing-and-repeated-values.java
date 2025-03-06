class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] hash = new int[(n * n) + 1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                hash[grid[i][j]]++;
            }
        }
        System.out.println(Arrays.toString(hash));
        int[] res = new int[2];
        for(int i = 1; i < hash.length; i++) {
            if(hash[i] == 2) {
                res[0] = i;
            }
            if(hash[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}