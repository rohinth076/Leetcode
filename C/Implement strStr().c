
int strStr(char * a, char * b){
    
    
    int l,n,i,j,k,f;
    char c[1000000];
    
    l=strlen(b);
    n=strlen(a);
    
    if(l==0)
        return 0;
    
    f=0;
    for(i=0;i<=n-l;i++)
        if(a[i]==b[0])
        {
            k=0;
            for(j=i;j<i+l;j++)
             c[k++]=a[j];
             c[k++]='\0';
            if(strcmp(c,b)==0)
            {
                f=1;
                break;
            }
            
        }
    if(f==1)
        return i;
    return -1;
}