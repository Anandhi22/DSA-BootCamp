class Solution {
    public int jump(int[] nums) {
        
        int[] dp = new int[nums.length+1];
        
        for(int i = 0;i<=nums.length;i++)
            dp[i]= -1;
        
        return minJump(nums, 0,dp );
        
    }
    
    public int minJump(int[] nums, int currIndex,int[] dp)
    {
        if(currIndex >=nums.length-1)  return 0;
        
        if(dp[currIndex]!=-1) return dp[currIndex];
        
        int ways = 10001;
        
        for(int i = 1;i<=nums[currIndex];i++)
        {
            int temp = 1 + minJump(nums, currIndex+ i, dp);
            ways = Math.min(temp,ways);
        }
        dp[currIndex] = ways;
        
        return ways;
    
    }
}
