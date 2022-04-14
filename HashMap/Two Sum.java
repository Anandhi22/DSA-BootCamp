class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      HashMap<Integer, Integer> memo = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++)
        {
            
            int key = target-nums[i];
            if(memo.containsKey(key)) 
             return new int[]{memo.get(key), i};
          else
            map.put(nums[i], i);
        }
      return new int[2];
    }
    
}
