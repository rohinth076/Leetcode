
bool isPalindrome(int x){
    long l,s,r;
    l=x;
    s=0;
    if(l>=0)
while(l!=0)
{
    r=l%10;
    s=s*10+r;
    l=l/10;
}
    if(s==x)
        return true;
    else
        return false;
}
