class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
      
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target) 
                return mid;
            
            
            //to check which part is sorted
            
            //for left half is sorted , otherwise right is sorted
            if(nums[mid]>= nums[start])
            {
                //if element is present on the left half
                if(target>=nums[start] && target<nums[mid])
                    end = mid-1;
                //else on the right side
                else 
                    start = mid+1;
            }
            else
            {
               if(target>nums[mid] && target<=nums[end])
                    start= mid+1;
                else 
                    end = mid-1;
            }
        }
        
        return -1;
    }
}
