class Solution {
    public int countPrimes(int n) 
    {
       boolean[] a = new boolean[n+3];
       Arrays.fill(a,true);
       a[0] = a[1] = false;
       int c = 0;
       for(int i=2;i<n;i++){
           if(a[i] == true){
               c++;
               for(int j=i+i;j<=n;j+=i){
                   a[j] = false;
               }
           }
       }
     return c;
    }
}