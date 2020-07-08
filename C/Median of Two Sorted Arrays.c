double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
    
    int i,a[10000],j,k,c,n;
    float m;
    
    for(i=0;i<nums1Size;i++)
       a[i]= *(nums1+i);
      j=i;
     for(i=0;i<nums2Size;i++)
     {
         a[j]= *(nums2+i);
         j++;
     }
       n= nums1Size+ nums2Size;
    for(i=0;i<n-1;i++)
        for(j=i+1;j<n;j++)
            if(a[i]>a[j])
            {
                c=a[i];
                a[i]=a[j];
                a[j]=c;
            }
    if(n%2!=0)
      m=a[n/2];
    else
      m=(float)(a[n/2]+a[n/2-1])/2;
    
    return m;
    
}
