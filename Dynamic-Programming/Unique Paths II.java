class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        
         return findUniquePathWithObstacle(0, 0, obstacleGrid.length, obstacleGrid[0].length,  obstacleGrid, new HashMap<>());
        
    }
    private int findUniquePathWithObstacle(int currRow, int currCol, int m, int n,int[][] obstacleGrid, HashMap<String, Integer> memo)
    {
       
        
        if(currRow >= m || currCol>=n || obstacleGrid[currRow][currCol]==1) return 0;
        
         if(currRow == m-1 && currCol==n-1) return 1;
        
        String key = currRow + "-" + currCol;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        int rightMove = findUniquePathWithObstacle(currRow, currCol+1, m ,n,obstacleGrid,memo );
        
         int downMove = findUniquePathWithObstacle(currRow+1, currCol, m ,n,obstacleGrid,memo);
        
        memo.put(key, rightMove+downMove);
        
        return memo.get(key);
        
        
        
    }
}
   
