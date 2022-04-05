class union {
    public static int[] unionFind(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Boolean> memo = new HashMap<>();
       
        for(int val1 : nums1)
        {
            if(memo.containsKey(val1)) continue;
            else memo.put(val1, true);
        }
        
        for(int val2 : nums2)
        {
            if(memo.containsKey(val2)) continue;
            else memo.put(val2, true);
        }
        
        int[] ans = new int[memo.size()];

        int i = 0;

        for(int val : memo.keySet())
            {
                ans[i]= val;
                i++;
            }

  return ans;
    }
