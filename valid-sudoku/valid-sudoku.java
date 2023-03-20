class Solution {
    boolean fun(char [][]a,int m,int n)
    {
        int []b = {0,0,0,0,0,0,0,0,0};
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(a[i+(m*3)][j+(n*3)] != '.')
                  b[a[i+(m*3)][j+(n*3)] - 49]++;
        for(int i=0;i<9;i++)
           if(b[i]>=2)
                return false;
        return true;
    }
    public boolean isValidSudoku(char[][] a) 
    {
        int n = 9;
        boolean flag = true;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!='.')
                {
                for(int k=i+1;k<n;k++)
                    if(a[i][j]==a[k][j])
                       return false;
            
                  for(int k=j+1;k<n;k++)
                    if(a[i][j]==a[i][k])
                       return false;
                }
            }
        }
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(! fun(a,i,j))
                    return false;
        
        return true;
        
    }
}