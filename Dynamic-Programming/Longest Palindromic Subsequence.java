//Time Complexity = O(s.length()^2)
//Space Complexity = O(s.length()^2)

class Solution {
    public int longestPalindromeSubseq(String s) {
        
        String s2 = new StringBuilder(s).reverse().toString();
        
        int[][] dp = new int[s.length()][s2.length()];
        
        
        for(int i = 0;i<s.length();i++)
        {
             for(int j = 0;j<s2.length();j++)
             {
                 dp[i][j] = -1;
             }
        }
        
        
         return findLength(s, s2, 0, 0, s.length(), s.length(), dp);
    }
    
    private int findLength(String s1, String s2, int i, int j, int len1, int len2, int[][]dp)
    {
        
        if(i>=len1 || j>=len2) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int ans = 0;
        
        if(s1.charAt(i)==s2.charAt(j))
        {
            ans = 1 + findLength(s1, s2, i+1, j+1, len1, len2, dp);
        }
        else
        {
            int a = findLength(s1, s2, i, j+1, len1, len2, dp);
            int b = findLength(s1, s2, i+1, j, len1, len2, dp);
            ans = Math.max(a,b);
        }
        
        dp[i][j] = ans;
        return ans;
       
    }
}
