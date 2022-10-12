class Solution {
    int r,c;
    int f(int[][] grid,int i,int j,int[] end,int empty){
        if(i < 0 || i >=r || j<0 || j >= c)return 0;
        if(i == end[0] && j == end[1]){
           // System.out.println(empty);
            return (empty==0)?1:0;
        }
        if(grid[i][j] != 0)return 0;
        grid[i][j] = -1;
       
        int ans = f(grid,i-1,j,end,empty-1)+f(grid,i+1,j,end,empty-1)+f(grid,i,j-1,end,empty-1)+f(grid,i,j+1,end,empty-1);
            
        grid[i][j] =  0;
        return ans;
    }
    public int uniquePathsIII(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int empty = 0;
        int[] end = new int[2];
        int[] start = new int[2];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                switch(grid[i][j]){
                    case 0:
                        empty++;
                        break;
                    case 1:
                        start[0] = i;
                        start[1] = j;
                        break;
                    case 2:
                        end[0] = i;
                        end[1] = j;
                        break;
                }
            }
        }
       // System.out.println(empty+Arrays.toString(start)+Arrays.toString(end));
        grid[start[0]][start[1]] = 0;
        return f(grid,start[0],start[1],end,empty+1);
    }
}