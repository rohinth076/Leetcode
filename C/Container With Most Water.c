int maxArea(int* a, int n){
    int i,j,f,b,k;
    
   if(a[0]>a[1])
       k=a[1];
    else
        k=a[0];
    
    f=1*k;
    
    for(i=0;i<n-1;i++)
    {
        b=1;
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
                k=a[j];
            else
                k=a[i];
            if(f<b*k)
                f=b*k;
            b++;
        }
    }  
    return f;
}