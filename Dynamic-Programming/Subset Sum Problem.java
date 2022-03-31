
class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        
        int[][] dp = new int[N][sum+1];
        
        for(int i =0;i<N;i++)
         for(int j =0;j<sum+1;j++)
             dp[i][j] = -1;
         
         return findSubset(arr, N, 0, sum , dp);
         
       
    }
     static Boolean findSubset(int[] arr, int n, int currIndex, int sum, int[][]dp)
     {
         if(sum==0) return true;
         
         if(currIndex>=n) return false;
         
         if(dp[currIndex][sum]!= -1){
             if( dp[currIndex][sum] == 1) return true;
             else return false;
         }
         
         
         boolean pick = false;
         boolean nonPick = false;
         
         if(arr[currIndex] <=sum)
            pick = findSubset(arr, n, currIndex+1, sum - arr[currIndex], dp);
            
         if(pick!=true) 
            nonPick = findSubset(arr, n, currIndex+1, sum , dp);
            
            
            if(pick ||nonPick == true)
             dp[currIndex][sum] = 1;
            else  dp[currIndex][sum] = 0;
          
         if( dp[currIndex][sum] == 1) return true;
         else return false;
     }
}
