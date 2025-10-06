class Solution {
    private final int[][] dir = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
    public int swimInWater(int[][] grid) {
        int len = grid.length;
        int low = grid[0][0];
        int high = len * len - 1;
        while(low < high) {
            int mid = (low + high) / 2;
            if(canReach(grid, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canReach(int[][] grid, int time) {
        int len = grid.length;
        if(grid[0][0] > time) return false;

        boolean[][] visited = new boolean[len][len];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            if(x == len - 1 && y == len - 1 ) return true;
            for(int[] i : dir) {
                int a = x + i[0];
                int b = y + i[1];
                if(a >= 0 && b >= 0 && a < len && b < len && !visited[a][b] && grid[a][b] <= time) {
                    visited[a][b] = true;
                    q.offer(new int[]{a, b});
                }
            }
        }
        return false;
    }

}