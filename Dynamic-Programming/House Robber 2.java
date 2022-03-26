public static int rob(int[] nums) {

        Map<Integer, Integer> memo1 = new HashMap<>();

        Map<Integer, Integer> memo2 = new HashMap<>();

        if(nums.length == 1) return nums[0];

        return Math.max(checkRobs(nums,0, nums.length-1,  memo1), checkRobs(nums,1, nums.length,  memo2));
    }

    public static int checkRobs(int[] nums,int index, int end, Map<Integer, Integer> memo)
    {
        if(index>=end) return 0;

        if(memo.containsKey(index)) return memo.get(index);

        int pick = nums[index] + checkRobs(nums,index+2, end,  memo);
        int nonPick = checkRobs(nums, index+1, end,  memo);

        memo.put(index, Math.max(pick,nonPick));
        return memo.get(index);
    }
