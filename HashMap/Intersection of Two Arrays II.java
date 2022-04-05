class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> memo = new HashMap<>();
        List<Integer> list = new ArrayList<>();
       
        for(int val1 : nums1)
        {
            if(memo.containsKey(val1)) 
            {
                memo.put(val1, memo.get(val1)+1);
            }
            else memo.put(val1, 1);
        }
        
        for(int val2 : nums2)
        {
            if(memo.containsKey(val2) && memo.get(val2) >=1)
            {
                list.add(val2);
                memo.put(val2, memo.get(val2)-1);
            }
           
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for(int entry : list){
          ans[i] = entry;
          i++;
    }
        return ans;
    }
}
