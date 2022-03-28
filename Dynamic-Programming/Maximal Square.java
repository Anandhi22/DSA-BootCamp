class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int maximum = 0;
        HashMap<String, Integer> memo = new HashMap<>();
        
         for( int i = 0;i<matrix.length;i++){
              for( int j = 0;j<matrix[0].length;j++){
                  
             if(matrix[i][j] == '1'){
             int result =  findMaxSquare(matrix, i, j, matrix.length, matrix[0].length,memo);
              maximum = Math.max(maximum, result * result );
             }
                  
             }
         }
        return maximum;
        
    }
    
    private int findMaxSquare(char[][] matrix, int currRow, int currCol, int row, int col, HashMap<String, Integer> memo)
    {
        if( currCol<=-1 || currCol>=col || currRow<=-1 || currRow>=row || matrix[currRow][currCol] == '0') return 0;
        
     
         String key = currRow + "-" + currCol;
        
        if(memo.containsKey(key)) return memo.get(key);
        
       int right = 1 + findMaxSquare(matrix, currRow, currCol + 1,row, col,memo);
       int down =  1 +   findMaxSquare(matrix,currRow+1, currCol ,row, col,memo);
       int diagonal = 1 +  findMaxSquare(matrix, currRow+1, currCol + 1, row, col,memo);
           
        int ans = Math.min(right, Math.min(down,diagonal));
        
        memo.put(key, ans);
        
        return memo.get(key);
    }
}
