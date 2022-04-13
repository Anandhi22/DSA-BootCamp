class Solution {
    public int subarraySum(int[] arr, int target) {
        
        int ans = 0;
        int prefixSum = 0;
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        memo.put(prefixSum,1);
        
        for( int currVal : arr)
        {
            prefixSum += currVal;
            
            if(memo.containsKey(prefixSum - target)) 
                ans += memo.get(prefixSum-target);
            
          if(memo.containsKey(prefixSum)) 
              memo.put(prefixSum, memo.get(prefixSum)+1);
            else
              memo.put(prefixSum,1);
        }
        
        return ans;
    }
}
