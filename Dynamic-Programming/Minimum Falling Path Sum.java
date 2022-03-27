class Solution 
   {
    
  public int minFallingPathSum(int[][] matrix) {
        
        int result, minimum = 100001;
        
         for( int i = 0;i<matrix[0].length;i++){
         
              result =  minFallingPath(matrix, 0, i, matrix.length, matrix[0].length, new HashMap<>());
              minimum = Math.min(minimum,result);
         }
        return minimum;
        
    }
    
    public int minFallingPath(int[][] matrix, int currRow, int currCol, int row, int col, HashMap<String, Integer> memo)
    {
        
        if(currRow>=row || currRow<=-1 || currCol<=-1 || currCol>=col) return 10001;
        
        if(currRow == row-1) return matrix[currRow][currCol];
        
        String key = currRow + "-" + currCol;
        
        if(memo.containsKey(key)) return memo.get(key);
        
        int leftDown = matrix[currRow][currCol] + minFallingPath(matrix, currRow+1, currCol-1, row, col, memo);
        int below =   matrix[currRow][currCol] + minFallingPath(matrix, currRow+1, currCol, row, col, memo);
        int rightDown = matrix[currRow][currCol] + minFallingPath(matrix, currRow+1, currCol+1, row, col, memo);
        
        int  ans = Math.min(leftDown, Math.min(below, rightDown));
        
         memo.put(key, ans);
        
        return memo.get(key);
        
    }
    
}
