// Time Complexity = o(n * target * k)
// Space Complexity = o(n *target)


class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        
        return findTotalWays(n, k, target, new HashMap<>());
    }
    
    public int findTotalWays(int n , int f, int target, HashMap<String, Integer> memo)
    {
        if(n==0 && target==0) return 1;
        
        if(n==0 && target>0) return 0;
        
        if(target<=0) return 0;
        
        String key = n + "-" + target;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        int MOD = 1000000007;
        
        int ways = 0;
        
        for(int i = 1;i<=f;i++)
        {
            int totalWays = findTotalWays(n-1 , f, target-i, memo) % MOD ;
            ways = ways%MOD;
            ways = (totalWays + ways) % MOD;            
        }
        
        memo.put(key, ways);
        
        return memo.get(key);
        
        
    }
}
