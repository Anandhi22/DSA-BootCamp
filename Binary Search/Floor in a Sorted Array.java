class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        return findFloorTarget(arr, n, x);
    }
    
    public static int findFloorTarget(long[] arr, int n, long x)
    {
        int start = 0;
        int end =  n-1;
        int floor = -1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == x)
              return mid;
            else if(arr[mid]<x)
            {
                floor = mid;
                start = mid+1;
            }
            else end = mid-1;
            
        }
        return floor;
    }
    
}
