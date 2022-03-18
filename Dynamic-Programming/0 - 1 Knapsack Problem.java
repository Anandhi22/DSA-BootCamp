static int knapSack(int Capacity, int wt[], int val[], int n) 
    { 
         return maxProfit(Capacity, wt, val,0,n, new HashMap<>());
    } 
    
    public static int maxProfit(int capacity , int[] weight, int[] profit,  int currIndex,int n, HashMap<String, Integer> map)
    {
        if(currIndex>=n) return 0;

         int currItemWeight =  weight[currIndex];
         int currItemProfit =  profit[currIndex];
        
        String key = currIndex + "-" + capacity;
        
        if(map.containsKey(key))
            return map.get(key);

        int pickItem = 0;
        
        if(currItemWeight<=capacity)   
        pickItem = currItemProfit + maxProfit(capacity - currItemWeight, weight, profit,currIndex+1, n, map);
        
        int nonPickItem =  maxProfit(capacity , weight, profit,currIndex+1,  n, map);
        
         map.put(key, Math.max(pickItem, nonPickItem));
        
        return map.get(key);
        
    }