class Solution {
    public int maxProfit(int[] prices) {
        
    return maxProfit(prices, 0, 1,  new HashMap<>());
    }
    
    private int maxProfit( int[] prices, int currentDay, int canBuy,  HashMap<String,Integer> memo)
    {
        if(currentDay >= prices.length) return 0;
        
        String key = currentDay + "-" + canBuy ;
        
        if(memo.containsKey(key)) 
            return memo.get(key);
            
       int ans = 0;
        
        
        if(canBuy==1)
        {
            int idle = maxProfit(prices, currentDay+1, canBuy, memo);
            int buy =  -prices[currentDay]+ maxProfit(prices, currentDay+1,0, memo);
            ans = Math.max(idle,buy);
        } else
        {
            int idle = maxProfit(prices, currentDay+1, canBuy, memo);
            int sell =  prices[currentDay] + maxProfit(prices, currentDay+1,1,  memo);
            ans = Math.max(idle,sell);
        }
       
          
        memo.put(key, ans);
        return memo.get(key);
     }
}
