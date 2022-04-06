public class Solution {

	public static int countSubarrays(int n, int[] arr) {
		
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        memo.put(0,1);
        
        int ans = 0;
        int prefixSum = 0;
        
        for(int val: arr)
        {
        
          prefixSum+=val;
            if(memo.containsKey(prefixSum))
            {
                ans+=memo.get(prefixSum);
                memo.put(prefixSum, memo.get(prefixSum)+1);
                
            }
            else memo.put(prefixSum,1);
        }
        
        return ans;
	}

}
