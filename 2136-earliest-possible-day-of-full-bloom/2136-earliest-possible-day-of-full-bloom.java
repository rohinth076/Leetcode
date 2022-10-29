class Solution {
    int fun(int[] a,int[] b){
        if(a[1] == b[1])
            return a[0] - b[0];
        return b[1] - a[1];
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = plantTime[i];
            a[i][1] = growTime[i];
        }
        Arrays.sort(a,(i,j)->fun(i,j));
        int ans = 0;
        int d = 0;
        for(int[] i:a){
            d += i[0];
            ans = Math.max(ans,d+i[1]+1);
        }
        return ans-1;
    }
}