class Solution {

    public void dfs(int row, int col, boolean[][] visited, char[][] grid, int n, int m) {

        // Base conditions
        if (row < 0 || row >= n || col < 0 || col >= m 
            || visited[row][col] == true 
            || grid[row][col] == '0') {
            return;
        }

        visited[row][col] = true;

        // 4 directions
        dfs(row, col - 1, visited, grid, n, m); // left
        dfs(row, col + 1, visited, grid, n, m); // right
        dfs(row - 1, col, visited, grid, n, m); // up
        dfs(row + 1, col, visited, grid, n, m); // down
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, visited, grid, n, m);
                    count++;
                }
            }
        }

        return count;
    }
}