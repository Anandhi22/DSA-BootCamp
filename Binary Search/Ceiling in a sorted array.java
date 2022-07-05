public class Solution {
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
         int start = 0;
         int end = n-1;
        int ceil = -1;
     
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
           if(arr[mid] == x) return x;
            
            else if(arr[mid] <  x)
                start = mid+1;
            else 
            {
                ceil = mid;
                end = mid-1;
            }
        }
       return arr[ceil];
    }
}
