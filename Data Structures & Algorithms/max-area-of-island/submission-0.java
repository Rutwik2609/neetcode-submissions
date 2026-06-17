class Solution {

    public int maxArea(int[][] grid, int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0; // mark visited

        int area = 1; // count current cell

        area += maxArea(grid, i - 1, j, n, m);
        area += maxArea(grid, i + 1, j, n, m);
        area += maxArea(grid, i, j - 1, n, m);
        area += maxArea(grid, i, j + 1, n, m);

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int area = maxArea(grid, i, j, n, m);
                    res = Math.max(res, area);
                }
            }
        }

        return res;
    }
}