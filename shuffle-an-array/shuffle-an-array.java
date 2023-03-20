class Solution {
    private int[] array;
    private int[] original;

    private Random rand = new Random();
    
    public Solution(int[] nums) {
        array = nums;
        original = nums.clone();
    }
    
    public int[] reset() {
        array = original.clone();
        return array;
    }
    
    public int[] shuffle() {
        List<Integer> l = new ArrayList<>();
        for(int i:array)
            l.add(i);
        for(int i=0;i<array.length;i++){
            int val = rand.nextInt(l.size());
            array[i] = l.remove(val);
        }
        
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */