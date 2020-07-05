class Solution {
    public int[] twoSum(int[] a, int t) 
    {
        int []b = new int[2];
        int i,j,n;
        n=a.length;
        for(i=0;i<n-1;i++)
            for(j=i+1;j<n;j++)
                if(a[i]+a[j]==t)
                {
                    b[0]=i;
                    b[1]=j;
                    break;
                }
        return b;
    }
}