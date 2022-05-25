class Solution {
    public void solveSudoku(char[][] board) {
        sudokoSolver(board, 0, 0, board.length);
        return;
    }
    
    private boolean sudokoSolver(char[][] board, int currentRow, int currentCol, int n)
    {
        if(currentRow == n)
            return true;
        
        int nextRowIndex = 0;
        int nextColIndex = 0;
        
        if(currentCol != n-1)
        {
            nextRowIndex = currentRow;
             nextColIndex = currentCol+1;
        }
        else{
             nextRowIndex = currentRow +1;
             nextColIndex = 0;
        }
        
        
        if(board[currentRow][currentCol] != '.')
           return sudokoSolver(board, nextRowIndex, nextColIndex , n);
        
       for(char currVal = '1'; currVal <= '9' ; currVal++)
        {
            
            if(isValid(board, currentRow, currentCol, currVal, n))
            {
               board[currentRow][currentCol] = currVal;
                
                if(sudokoSolver(board, nextRowIndex, nextColIndex , n))
                    return true;
                else 
                    board[currentRow][currentCol] = '.'; 
            }
        }
        return false;
    }
    
    private boolean isValid(char[][] board, int currentRow, int currentCol, char currVal, int n)
    {
        return isRowValid(board, currentRow, currVal, n) && isColValid(board, currentCol, currVal, n)
            && isSubGridValid(board, currentRow, currentCol, currVal, n);
    }
    
    private boolean isRowValid(char[][] board, int currentRow, char currVal, int n)
    {
        for( int currentCol = 0; currentCol<=8; currentCol++)
            if(board[currentRow][currentCol] == currVal)
                return false;
        return true;
    }
    
    private boolean isColValid(char[][] board, int currentCol, char currVal, int n)
    {
        for( int currentRow = 0; currentRow<=8; currentRow++)
            if(board[currentRow][currentCol] == currVal)
                return false;
        return true;
    }
    
     private boolean isSubGridValid(char[][] board,int currentRow, int currentCol, char currVal, int n)
    {
         int startRowIndex = 3 * (currentRow/3);
         int startColIndex = 3 * (currentCol/3);
         
        for( int i= startRowIndex; i<= startRowIndex+2 ; i++)
            for( int j= startColIndex; j<=startColIndex+2; j++)
                if(board[i][j] == currVal)
                return false;
        return true;
    }
    
}
