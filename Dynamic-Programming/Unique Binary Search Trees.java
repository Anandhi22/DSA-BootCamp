class Solution {
    public int numTrees(int n) {
        
        int[] dp = new int[n+1];
        
        for(int i = 0;i<=n;i++)
            dp[i]= -1;
        return possibleTree(n, dp);
        
    }
    
    //Catalan series
    public int possibleTree(int n, int[] dp)
    {
        if(n==0||n==1) return 1;
        
       if(dp[n]!=-1) return dp[n];
        
        int ways = 0;
        
        for(int i =0 ;i<n;i++)
        {
           //c(n) = c(i) +(n-i-1);
            ways += (possibleTree(i, dp) * possibleTree(n-i-1, dp));
        }
        
        dp[n]= ways;
        
        return ways;
        
    }
}
