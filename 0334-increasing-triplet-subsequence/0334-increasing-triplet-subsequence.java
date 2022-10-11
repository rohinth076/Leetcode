class Solution {
    public boolean increasingTriplet(int[] a) {
        int n = a.length;
        int[] pre = new int[n],suf = new int[n];
        
        Arrays.fill(pre,-1);
        Arrays.fill(suf,-1);
        
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && a[i] > a[s.peek()]){
                pre[s.pop()] = i;
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && a[i] < a[s.peek()]){
                suf[s.pop()] = i;
            }
            s.push(i);
        }
        for(int i=0;i<n;i++)
            if(pre[i] != -1 && suf[i] != -1)
                return true;
        return false;
    }
}