// Time Complexity = O(m*n)
//Space Complexity = O(min(length of s1, length of s2))

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
     
        
        return findLength(text1, text2, 0, 0, text1.length(), text2.length(), new HashMap<>());
    }
    
    private int findLength(String s1, String s2, int i, int j, int len1, int len2, HashMap<String, Integer> memo)
    {
        
        if(i>=len1 || j>=len2) return 0;
        
        String key = i + "-" + j;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        int ans = 0;
        
        if(s1.charAt(i)==s2.charAt(j))
        {
            ans = 1 + findLength(s1, s2, i+1, j+1, len1, len2, memo);
        }
        else
        {
            int a = findLength(s1, s2, i, j+1, len1, len2, memo);
            int b = findLength(s1, s2, i+1, j, len1, len2, memo);
            ans = Math.max(a,b);
        }
        
        memo.put(key, ans);
        
        return memo.get(key);
    }
}
