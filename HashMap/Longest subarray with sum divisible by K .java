class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
         int ans = 0;
        int prefixSum = 0;
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        memo.put(prefixSum,-1);
        
        for( int i = 0;i<n;i++)
        {
            prefixSum += a[i];
            int currRem = ((prefixSum % k)+k) % k;
            
            if(memo.containsKey(currRem)) 
                {
                    ans = Math.max(ans,i - memo.get(currRem));
                }
            
           if(!memo.containsKey(currRem)) 
            memo.put(currRem,i);
        }
        
        return ans;
        
    }
}
