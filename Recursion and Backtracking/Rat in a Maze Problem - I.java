class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
       
       ArrayList<String> ans = new ArrayList<>();
       
       findMazePath(m,n,0,0,"",ans);
       
       return ans;
    }
    
    private static void findMazePath(int[][] m, int n, int currentRow, int currentCol, String currentPath, ArrayList<String>ans)
    {
        if( currentRow < 0 || currentRow >= n || currentCol < 0 || currentCol >= n || m[currentRow][currentCol] <=0)
        return;
        
         if(currentRow == n-1 && currentCol == n-1)
         {
             ans.add(currentPath);
             return;
         }
        
         m[currentRow][currentCol] = -1;
         
           //down call
          findMazePath(m,n,currentRow +1, currentCol,currentPath + "D", ans);
          
          //left call
          findMazePath(m,n,currentRow , currentCol -1,currentPath + "L", ans);
          
          //right call
          findMazePath(m,n,currentRow , currentCol+1,currentPath + "R", ans);
          
          //up call
          findMazePath(m,n,currentRow-1 , currentCol,currentPath + "U", ans);
          
          m[currentRow][currentCol] = 1;
        
    }
}
