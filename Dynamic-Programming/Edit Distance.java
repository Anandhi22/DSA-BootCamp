//Time Complexity = O(s1.length * s2.length)
//space Complexity = O(s1.length * s2.length)


class Solution {
    public int minDistance(String word1, String word2) {
        
        return minOperations(word1,word2,  0 ,0 , word1.length(),  word2.length(), new HashMap<>());
        
    }
    
    public int minOperations(String s1, String s2, int i , int j , int m, int n, HashMap<String, Integer> memo){
        
        
        if(j>=n) return m-i;
        
         if(i>=m) return n-j;
        
        String key = i + "-" + j;
        
        if(memo.containsKey(key))  return memo.get(key);
        
        int ans = 5000;
        
        if(s1.charAt(i) == s2.charAt(j))
            ans= minOperations(s1,s2,  i+1 ,j+1 , m,  n, memo);
        else
        {
            int insertion = minOperations(s1,s2,  i ,j+1 , m,  n, memo);
            int deletion = minOperations(s1,s2,  i+1 ,j , m,  n, memo);
           int replace = minOperations(s1,s2,  i+1 ,j+1 , m,  n, memo);
            
            ans = 1 + Math.min(insertion, Math.min(deletion,replace));
        }
            
        memo.put(key, ans);
        return memo.get(key);
        
    }
}

