public static int maxProfit(int capacity, int[] weight, int[] profit, int currIndex, int n, HashMap<String, Integer> map) {
       //if capcity is zero at any point, return 0
          if(capacity == 0) 
           return 0;

          //base condition when array bounds out of length
        if (currIndex >= n) return 0;

        int currItemWeight = weight[currIndex];
        int currItemProfit = profit[currIndex];
        
        //declare the key for 2D Dynamic Programming
        String key = currIndex + "-" + capacity;
        
        //check if the map already contains key
        if (map.containsKey(key))
            return map.get(key);
        
        int pickItem = 0;
        
        //check if weight of current index is less than or equal to capacity only then check for pickItem
        if (currItemWeight <= capacity)
            //pickItem = profit + function call of the same current Index - unbounded Knapsack(includes duplicates)
            pickItem = currItemProfit + maxProfit(capacity - currItemWeight, weight, profit, currIndex, n, map);
        
        //dont pick, move to next index
        int nonPickItem = maxProfit(capacity, weight, profit, currIndex + 1, n, map);
        
        //check for max and update in map
        map.put(key, Math.max(pickItem, nonPickItem));
        return map.get(key);

    }