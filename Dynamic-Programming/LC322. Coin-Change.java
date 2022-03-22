class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0) return 0;
        
      int ans = minCount(amount, coins, 0, new HashMap<>());
        
        if(ans >=10000) return -1;
        
        return ans;
    }

    public  int minCount(int amount, int[] coins, int currIndex, HashMap<String, Integer> map) {
        
        //if amount is zero at any point, return 0
        if (amount == 0)
            return 0;
        //base condition when array bounds out of length
        if (currIndex >= coins.length) return Integer.MAX_VALUE;

        //declare the key for 2D Dynamic Programming
        String key = currIndex + "-" + amount;

        //check if the map already contains key
        if (map.containsKey(key))
            return map.get(key);

        //assigning pick to have highest possible value of amount, if in case the pick is skipped, nonpicked can still be minimum
        int pickItem = 10000;
        
        //check if coins of current index is less than or equal to amount only then check for pickItem
        if (coins[currIndex] <= amount)
            
            pickItem = 1 + minCount(amount - coins[currIndex], coins, currIndex, map);
        
        //dont pick, move to next index
        int nonPickItem = minCount(amount, coins,currIndex + 1, map);

        //check for max and update in map
        map.put(key, Math.min(pickItem, nonPickItem));

        return map.get(key);

    }

}
