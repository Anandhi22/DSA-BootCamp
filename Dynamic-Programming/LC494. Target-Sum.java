class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
       return findTarget( nums,  target, 0, new HashMap<>());
    }
    
    private int findTarget( int[] nums, int target, int currIndex, HashMap<String, Integer> map)
    {
        if(currIndex== nums.length && target==0)
            return 1;
        if(currIndex>=nums.length && target!=0) return 0;
        
        String key = currIndex + "-" + target;
        
        if(map.containsKey(key))
            return map.get(key);

       int posSign = findTarget( nums,  target-nums[currIndex],  currIndex+1,  map);
        
        int negSign = findTarget( nums,  target+nums[currIndex],  currIndex+1,  map);
        
         map.put(key, posSign+negSign);
        
        return map.get(key);
        
    
    }
}
