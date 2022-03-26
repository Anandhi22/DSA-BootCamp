    public int rob(int[] nums) {
        return findMax(0, nums, new HashMap<>());
     }
    
    public  int findMax(int currIndex, int[] nums, HashMap<Integer, Integer> memo) {

        if (currIndex >= nums.length) return 0;

        if (memo.containsKey(currIndex)) return memo.get(currIndex);

        int pickHouse = nums[currIndex] + findMax(currIndex +2 , nums, memo);
        int  nonPickHouse =  findMax(currIndex + 1, nums, memo);
        
        memo.put(currIndex, Math.max(pickHouse,nonPickHouse));
        return memo.get(currIndex);
    }
