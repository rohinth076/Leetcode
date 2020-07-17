class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int []a = new int[2];
        ArrayList<Integer> li = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++)
            li.add(nums[i]);
        a[0] = li.indexOf(target);
        a[1] = li.lastIndexOf(target);
        return a;
        
    }
}