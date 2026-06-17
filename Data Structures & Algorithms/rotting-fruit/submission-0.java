class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int fresh =0;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;

        int count=0;

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                int[] rotpos = q.poll();
                int r = rotpos[0];
                int c = rotpos[1];
                int[][] nbrs = {{r,c-1},{r,c+1},{r-1,c},{r+1,c}};
                for(int[] nbr :nbrs){
                    int nr = nbr[0];
                    int nc = nbr[1];
                    if(nr>=0 && nr<n &&nc>=0 && nc<m && grid[nr][nc]==1){
                        q.offer(new int[]{nr,nc});
                        grid[nr][nc]=2;
                    }
                }
            }
            count++;
            fresh-=q.size();
            if(fresh==0) break;
        }

        return fresh==0?count:-1;
    }
}
