class Solution {
    int count(int[] arr, int n, int x) {
        
       int last  = lastOccurence(arr, n, x);
       int first = firstOccurence(arr, n,x);
       if(first==-1) return 0;
       else return last-first+1;
    }
    
    public int firstOccurence( int[] arr, int n ,int target)
    {
        int start = 0;
        int end = n-1;
        int ans = -1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target)
            {
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]< target)
            start = mid+1;
            else end = mid-1;
        }
        return ans;
    }
    
    public int lastOccurence( int[] arr,int n, int target)
    {
        int start = 0;
        int end = n-1;
        int ans = -1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target)
            {
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid]< target)
            start = mid+1;
            else end = mid-1;
        }
        return ans;
    }
}
