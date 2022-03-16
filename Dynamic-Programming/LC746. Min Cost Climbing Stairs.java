    public  int minCostClimbingStairs(int[] cost) {

        int indexZero = findClimbs(0, cost, new HashMap<>());
        int indexOne = findClimbs(1, cost, new HashMap<>());
        return Math.min(indexOne, indexZero);
     }

    public  int findClimbs(int currIndex, int[] cost, HashMap<Integer, Integer> memo) {
        if (currIndex == cost.length) return  + 0;
        else if (currIndex > cost.length) return + 1001;
        if (memo.containsKey(currIndex)) return memo.get(currIndex);
        int oneJump = cost[currIndex]+ findClimbs(currIndex + 1, cost, memo);
        int twoJumps = cost[currIndex]+ findClimbs(currIndex + 2, cost, memo);
        memo.put(currIndex, Math.min(oneJump, twoJumps));
        return memo.get(currIndex);
    }