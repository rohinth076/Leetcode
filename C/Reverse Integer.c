

int reverse(int x){
    
long l,s,r,f;
    
    f=pow(2,31)-1;
    if(x<0)
        l=(long)x * (-1);
    else
        l=(long)x;
    s=0;
    while(l!=0)
    {
        r=l%10;
        s=s*10+r;
        l=l/10;
        if(f<s)
            return 0;
    
    }
    if(x<0)
        s= s * (-1);
    return s;
}