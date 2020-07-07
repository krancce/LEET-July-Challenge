class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    int count = 4;
                    if(row-1>=0 && grid[row-1][col]==1){
                        count--;
                    }
                    if(row+1<grid.length && grid[row+1][col]==1){
                        count--;
                    }
                    if(col-1>=0 && grid[row][col-1]==1){
                        count--;
                    }
                    if(col+1<grid[0].length && grid[row][col+1]==1){
                        count--;
                    }
                    ans+=count;
                }
            }
        }
        return ans;
    }
}
