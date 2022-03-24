class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        long mod = 1000000007;
        
        long ans =  findWays(n,  new HashMap<>());
        return (ans % mod);
    }
    
    static long findWays(int target,  HashMap<Integer, Long> memo)
    {
        if(target==0) return 1;
        
        if(target<0) return 0;
        
        int key = target ;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        long oneJump = findWays(target-1, memo);
         long twoJump = findWays(target-2, memo);
          long threeJump = findWays(target-3,  memo);
          
          long ans = (oneJump+twoJump+threeJump) % 1000000007;
          
          memo.put(key,ans);
          
          return memo.get(key);
        
        
    }
}

