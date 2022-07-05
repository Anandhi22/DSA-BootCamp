class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length < 1) 
            return new int[] {-1,-1};
        
        int[] ans =  {-1, -1};
        ans[0] = firstPosition(nums, target);
        ans[1] = lastPosition(nums, target);
        
        return ans;
    }
    
    public int firstPosition(int[] nums,int target)
    {
        
        int start = 0;
        int end = nums.length-1;
        int ansIndex = -1;
        
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target) 
            {
                   ansIndex = mid;
                   end = mid-1;
            }
           
            
           else if(nums[mid]>target) 
             end = mid-1;
            
           else
             start = mid+1;
            
        }
       return ansIndex;
    }
    
    public int lastPosition(int[] nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ansIndex = -1;
        
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target) 
            {
                   ansIndex = mid;
                  start = mid+1;
            }
           
            
           else if(nums[mid]>target) 
             end = mid-1;
            
           else
             start = mid+1;
            
        }
       return ansIndex;
    }
    
    
    
}
