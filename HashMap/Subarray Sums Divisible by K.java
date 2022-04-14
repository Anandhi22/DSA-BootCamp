class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      
        int ans = 0;
        int prefixSum = 0;
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        memo.put(prefixSum,1);
        
        for( int currVal : nums)
        {
            prefixSum += currVal;
            int currRem = ((prefixSum % k)+k) % k;
            
            if(memo.containsKey(currRem)) 
                ans += memo.get(currRem);
            
          if(memo.containsKey(currRem)) 
              memo.put(currRem, memo.get(currRem)+1);
            else
              memo.put(currRem,1);
        }
        
        return ans;
    
    }
    
}
