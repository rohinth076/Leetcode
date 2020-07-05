int* twoSum(int* nums, int numsSize, int target, int* returnSize)
{
int i,j;
  int *returnArr = (int *)malloc(2*sizeof(int));
    *returnSize = 2;
    for(i=0;i<numsSize-1;i++)
        for(j=i+1;j<numsSize;j++)
            if(*(nums+i) + *(nums+j) == target)
            {
                *returnArr = i;
                *(returnArr+1) = j;
                return returnArr;
            }
return returnArr;
}