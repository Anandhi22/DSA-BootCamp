class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        for(int currVal : arr)
        {
           if(memo.containsKey(n+currVal) || memo.containsKey(currVal-n)) 
             return true;
          else
            memo.put(currVal, 1);
        }
      return false;
    }
    
}
