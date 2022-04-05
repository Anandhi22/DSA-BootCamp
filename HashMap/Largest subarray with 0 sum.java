class GfG
{
    int maxLen(int arr[], int n)
    {
         HashMap<Integer, Integer> memo = new HashMap<>();
         int prefixSum = 0;
         int ans = 0;
         memo.put(0, -1);
         
         for( int i =0;i<arr.length;i++)
         {
             prefixSum+=arr[i];
             
             if(memo.containsKey(prefixSum))
             ans = Math.max(ans,i - memo.get(prefixSum));
             else memo.put(prefixSum, i);
        }
        return ans;
         
    }
}
