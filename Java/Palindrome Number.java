class Solution {
    public boolean isPalindrome(int x) 
    {
        int s=0,r,n;
        n=x;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return(x==s);
    }
}