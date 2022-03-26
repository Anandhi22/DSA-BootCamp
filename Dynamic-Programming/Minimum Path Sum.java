class Solution {
    public int minPathSum(int[][] grid) {
        
         return minGrid(grid, 0, 0, grid.length, grid[0].length, new HashMap<>());
        
    }
    private int minGrid(int[][] grid, int currRow, int currCol, int m, int n, HashMap<String, Integer> memo)
    {
        if(currRow == m-1 && currCol==n-1) return grid[currRow][currCol];
        
        if(currRow >= m || currCol>=n) return 10001;
        
        String key = currRow + "-" + currCol;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        int rightMove = grid[currRow][currCol]+ minGrid(grid, currRow, currCol+1, m ,n, memo);
        
         int downMove = grid[currRow][currCol]+ minGrid(grid, currRow+1, currCol, m ,n, memo);
        
        memo.put(key, Math.min(rightMove, downMove));
        
        return memo.get(key);
     }
        
}
