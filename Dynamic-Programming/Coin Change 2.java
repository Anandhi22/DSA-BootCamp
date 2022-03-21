  class Solution {
    public int change(int amount, int[] coins) {
        return maxCount(amount, coins, 0, new HashMap<>());
    }
    
    public static int maxCount(int amount, int[] coins,int currIndex,  HashMap<String, Integer> map) {
        //if amount is zero at any point, return 1
        if(amount == 0)
            return 1;

        //base condition when array bounds out of length
        if (currIndex == coins.length) return 0;

       //declare the key for 2D Dynamic Programming
        String key = currIndex + "-" + amount;

        //check if the map already contains key
        if (map.containsKey(key))
            return map.get(key);

        int pickItem = 0;

        //check if coins of current index is less than or equal to amount only then check for pickItem
        if (coins[currIndex] <= amount)
            //pickItem = profit + function call of the same current Index - unbounded Knapsack(includes duplicates)
            pickItem =  maxCount(amount - coins[currIndex], coins, currIndex,  map);

        //dont pick, move to next index
        int nonPickItem = maxCount(amount, coins, currIndex + 1,  map);

        //check for max and update in map
        map.put(key,pickItem+nonPickItem);
        return map.get(key);

    }

}
