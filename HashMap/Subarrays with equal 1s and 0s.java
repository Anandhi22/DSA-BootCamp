class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
       
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        memo.put(0,1);
        
        int ans = 0;
        int prefixSum = 0;
        
        for(int val: arr)
        {
        
         if(val ==0) prefixSum+= -1;
         else prefixSum+=val;
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
    
