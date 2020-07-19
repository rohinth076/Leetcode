
int firstMissingPositive(int* a, int n){
    
    int i,j,c,k;
    
    for(i=0;i<n-1;i++)
        for(j=i+1;j<n;j++)
            if(a[i]>a[j])
            {
                c=a[i];
                a[i]=a[j];
                a[j]=c;
            }
    for(k=0;k<n;k++)
        if(a[k]>0)
            break;
    c=1;
    
    for(i=k;i<n;i++)
        if(a[i]>c)
            break;
        else if(a[i]==c)
            c++;
    return c;
}