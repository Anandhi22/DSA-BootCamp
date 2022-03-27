 public  int minCostClimbingStairs(int[] cost) {

        
        //When you strat from Zeroth Index
        int indexZero = findClimbs(0, cost, new HashMap<>());
        
        //When you strat from Zeroth Index
        int indexOne = findClimbs(1, cost, new HashMap<>());
        
        //minimum of both
        return Math.min(indexOne, indexZero);
     }

    public  int findClimbs(int currIndex, int[] cost, HashMap<Integer, Integer> memo) {
        //when you found a path return 0
        if (currIndex == cost.length) return  0;
        
        //when you hav over jumped the last stair, return 1001
        else if (currIndex > cost.length) return  1001;
        
        //registering in map, hence dp 
        if (memo.containsKey(currIndex)) return memo.get(currIndex);
        
        //one Jump 
        int oneJump = cost[currIndex]+ findClimbs(currIndex + 1, cost, memo);
        
        //two jump
        int twoJumps = cost[currIndex]+ findClimbs(currIndex + 2, cost, memo);
        
        //update the map
        memo.put(currIndex, Math.min(oneJump, twoJumps));
        
        //return the total cost
        return memo.get(currIndex);
    }
