class Solution {
    public int[] findErrorNums(int[] a) {
        
        int ans[] = new int[2];
        int n = a.length;
        int b[] = new int[n];
        
        for(int i=0;i<n;i++){
            b[a[i]-1]++;
        }
        for(int i=0;i<n;i++){
            if(b[i] == 2)
                ans[0] = i+1;
            else if(b[i] == 0)
                ans[1] = i+1;
            if(ans[1] !=0 && ans[0] !=0)break;
        }
        
        return ans;
    }
}