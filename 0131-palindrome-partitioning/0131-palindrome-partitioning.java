class Solution {
    List<List<String>> ans;
    boolean isPalindrome(String s){
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
    void fun(String s,int i,int n,List<String> l){
        if(i == n){
            List<String> m = new ArrayList<>();
            for(String j:l)m.add(j);
            ans.add(m);
            return;
        }
        for(int j=i;j<n;j++){
            String x = s.substring(i,j+1);
            if(isPalindrome(x)){
                l.add(x);
               // System.out.println(j);
                fun(s,j+1,n,l);
                l.remove(l.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        int n = s.length();
        fun(s,0,n,new ArrayList<>());
        return ans;
    }
}