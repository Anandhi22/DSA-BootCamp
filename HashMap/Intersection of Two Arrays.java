class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Boolean> memo = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int val1 : nums1)
        {
            if(memo.containsKey(val1)) continue;
            else memo.put(val1, true);
        }
        
        for(int val2 : nums2)
        {
            if(memo.containsKey(val2) && memo.get(val2) == true){
                list.add(val2);
                memo.put(val2,false);
                }
        }
        
        int[] ans = new int[list.size()];
        
        for(int i = 0;i<list.size();i++)
        ans[i] = list.get(i);
        
        return ans;
    }
}
