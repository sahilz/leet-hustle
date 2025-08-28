class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int key = i - j;
                hm.putIfAbsent(key, key < 0 ? new PriorityQueue<>() : new PriorityQueue<>(Collections.reverseOrder()));
                hm.get(key).offer(grid[i][j]);
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int key = i - j;
                grid[i][j] = hm.get(key).poll();
            }
        }
        return grid;
    }
}