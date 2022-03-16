           LC70 . Climbing Stairs 
           
    // you are given with the nth steps which wwanted to be climbed with two possibilites of either one jump or two jumps 
    
    
    public int climbStairs(int n) {
        
       return checkClimbs(0, n, new HashMap<Integer, Integer>());
        
    }
    
    public int checkClimbs(int index, int n, HashMap<Integer, Integer> memo)
    {
        if(index == n) return 1;
        if(index > n) return 0;
        
        int currentKey = index;
        
        if(memo.containsKey(currentKey)) return memo.get(currentKey);
        
         int oneJump = checkClimbs(index+1, n, memo);
        int twoJumps = checkClimbs(index+2, n, memo);
        
        memo.put(index, oneJump+twoJumps);
        
        return oneJump+twoJumps;
          //return memo.get(currentKey);
       
    }
