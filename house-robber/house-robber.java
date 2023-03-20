class Solution {
    public int rob(int[] a) {
        int n = a.length;
        if(n == 1)return a[0];
        if(n >= 3)
            a[n-3] += a[n-1];
        for(int i=n-4;i>=0;i--)
            a[i] += Math.max(a[i+2],a[i+3]);
        return Math.max(a[0],a[1]);
    }
}