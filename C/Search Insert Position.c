

int searchInsert(int* nums, int numsSize, int target){
    
    int i,f;
    if(*(nums+numsSize-1) < target)
        return (numsSize);
    for(i=0;i<numsSize;i++)
        
        if(*(nums+i)>=target)
        {
            f=i;
            break;
        }
    
    return f;

}

