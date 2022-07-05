class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int firstPos = firstPosition(nums,target);
        
        if(firstPos == -1)
            return res;
        
        int lastPos= lastPosition(nums,target);
        
        for(int i = firstPos;i<=lastPos;i++)
        {
            res.add(i);
        }
        return res;
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
