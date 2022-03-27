 public boolean canPartition(int[] nums) {
        
        int sum = 0;
        for(int val : nums)
          sum+=val;
        
        if(sum%2!=0) return false;
        else return checkEqual(nums,0, sum/2,new HashMap<>());
       
        
    }
    
    private boolean checkEqual(int[] nums, int currIndex, int sum, HashMap<String, Boolean> map)
    {
        if(sum == 0)
          return true ;
        
        if(currIndex >= nums.length) 
            return false;
        
         boolean addItem =  false;
         boolean nonAddItem = false;
        
        String key = currIndex + "-" + sum;
        
        if(map.containsKey(key))
            return map.get(key);

        
        if(nums[currIndex]<=sum)   addItem = checkEqual(nums,  currIndex+1,  sum - nums[currIndex],  map);
        
        if(addItem!=true) nonAddItem = checkEqual(nums,  currIndex+1,  sum ,  map);
        
       map.put(key,addItem || nonAddItem) ;
        
        return map.get(key);
        
    }
