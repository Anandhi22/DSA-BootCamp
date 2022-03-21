public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int diff = 4;
        System.out.println(findTargetSumWays(arr, diff));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int val : nums)
            totalSum += val;
        target = (totalSum - target) / 2;
        return findTarget(nums, target, 0, new HashMap<>());
    }

    private static int findTarget(int[] nums, int target, int currIndex, HashMap<String, Integer> map) {
        //At any point, if sum == 0, return 1
        if (target == 0)
            return 1;
        
        //if the currIndex reaches the length of nums, return 0;
        if (currIndex >= nums.length) return 0;
        
        //declaring key for hashmap- 2D
        String key = currIndex + "-" + target;
        
        //check for presence of key in map
        if (map.containsKey(key))
            return map.get(key);
        
        int pick = 0;
        //if target is less than or equal to nums[currIndex], only then subtract it from target
        if (nums[currIndex] <= target) pick = findTarget(nums, target - nums[currIndex], currIndex + 1, map);
        
        //for notpicking the index, move to next index
        int notPick = findTarget(nums, target, currIndex + 1, map);
        
        //update it in map
        map.put(key, pick + notPick);
        
        return map.get(key);
    }
}
