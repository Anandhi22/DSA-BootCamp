class Solution {
    public boolean canJump(int[] nums) {
        
        return findCanJump(nums, 0, new HashMap<>());
        
    }
    
    private boolean findCanJump(int[] nums,int currIndex, HashMap<Integer, Boolean> memo )
    {
        if(currIndex >= nums.length-1) return true;
        
        if(memo.containsKey(currIndex)) return memo.get(currIndex);
        
        if(nums[currIndex] >= nums.length-1-currIndex) return true;
        
        boolean ways = false;
        
        for(int i = 1;i<=nums[currIndex];i++)
        {
           boolean ans  = findCanJump(nums, currIndex+ i, memo);
            ways = (ans||ways);
        }
        memo.put(currIndex, ways);
        
        return ways;
        
        
        
    }
}
