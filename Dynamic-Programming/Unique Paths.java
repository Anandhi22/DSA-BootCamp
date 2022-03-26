class Solution {
    public int uniquePaths(int m, int n) {
        
        return findUniquePath(0, 0, m, n, new HashMap<>());
        
    }
    private int findUniquePath(int currRow, int currCol, int m, int n, HashMap<String, Integer> memo)
    {
        if(currRow == m-1 && currCol==n-1) return 1;
        
        if(currRow >= m || currCol>=n) return 0;
        
        String key = currRow + "-" + currCol;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        int rightMove = findUniquePath(currRow, currCol+1, m ,n, memo);
        
         int downMove = findUniquePath(currRow+1, currCol, m ,n, memo);
        
        memo.put(key, rightMove+downMove);
        
        return memo.get(key);
        
        
        
    }
}
