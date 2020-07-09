class Solution {
    public int reverse(int x) 
    {
     int f = 1;
        if(x<0)
        {
            f = -1;
            x *= -1;
        }
        StringBuilder s = new StringBuilder(String.valueOf(x));
        try
        {
        s = s.reverse();
        int ans = Integer.valueOf(String.valueOf(s)) *f;
        if(Math.pow(-2,31)>ans || Math.pow(2,31)-1<ans)return 0;
        return ans;
        }catch(Exception e)
        {
            return 0;
        }
    }
}