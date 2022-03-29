//Time Complexity = O(n^3)
//Space Complexity = O(n)


class Solution {
    public int minCut(String s) {
        
    return findMinimum(s, 0, s.length()-1, new HashMap<>());
    }
    
    public int findMinimum(String s , int start, int end, HashMap<Integer, Integer> memo)
    {
        if(isPalindrome(s, start, end)) return 0;
        
        int key = start;
        
       if(memo.containsKey(key)) return memo.get(key);
        
        int ways = 100000;
        
        for(int i = start;i<end;i++)
        {
            if(isPalindrome(s, start, i))
            {
                int tempAns = 1 + findMinimum(s, i+1, end,  memo);
                ways = Math.min(ways,tempAns);
            }
        }
        
        memo.put(key, ways);
        
        return memo.get(key);
    }
    
    public boolean isPalindrome(String s,int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!= s.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
}
