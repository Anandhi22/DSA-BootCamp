class Solution {
    public int maxProfit(int[] prices, int fee) { 
        
       return maxProfit(prices, 0, 1,  new HashMap<>(), fee);
    }
    
    private int maxProfit( int[] prices, int currentDay, int canBuy,  HashMap<String,Integer> memo, int fee)
    {
        if(currentDay >= prices.length ) return 0;
        
        String key = currentDay + "-" + canBuy;
        
        if(memo.containsKey(key)) 
            return memo.get(key);
            
       int ans = 0;
        
        
        if(canBuy==1)
        {
            int idle = maxProfit(prices, currentDay+1, canBuy,  memo,fee);
            int buy =  -prices[currentDay]+ maxProfit(prices, currentDay+1,0,  memo,fee);
            ans = Math.max(idle,buy);
        } else
        {
            int idle = maxProfit(prices, currentDay+1, canBuy, memo, fee);
            int sell = -fee + prices[currentDay] + maxProfit(prices, currentDay+1,1,  memo,fee);
            ans = Math.max(idle,sell);
        }
       
          
        memo.put(key, ans);
        return memo.get(key);
     }
}
