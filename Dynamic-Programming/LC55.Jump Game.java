class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length==0 || nums.length==1) return true;
      return findJump(nums, 0, new HashMap<Integer, Boolean> ());
    }
    
    public boolean findJump(int[] nums, int currIndex, HashMap<Integer, Boolean> map)
    {
        if(currIndex == nums.length-1) return true;
        
        if(currIndex>=nums.length) return false;
        
        boolean ans = false;
        
        if(map.containsKey(currIndex)) return map.get(currIndex);
        
       for( int i = 1;i<= nums[currIndex];i++)
        {
           int key = currIndex+i;
           Boolean store =  findJump(nums, key, map);
            ans = ans||store;
         }
         map.put(currIndex, ans);
        return map.get(currIndex);
    }
}
