class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        combine(0, target,  candidates, new ArrayList<Integer>(), ans);
        
        return ans;
        
    }
    
    public void combine(int ind, int target,int[] arr,ArrayList<Integer> currentSubset, ArrayList<List<Integer>> ans)
    {
        
        if(target == 0) 
            {
              ans.add(new ArrayList<>(currentSubset));
                return;
            }
            
          if(ind == arr.length)
              return;
        
        
        if(arr[ind] <= target) 
        {
        
        currentSubset.add(arr[ind]);
        
        // since n times, the same index can be used.
        // unbounded KnapSack
        combine(ind, target- arr[ind], arr, currentSubset, ans);
        
        currentSubset.remove(currentSubset.size()-1);
        }
        
        combine(ind+1, target,arr,currentSubset, ans);
        
    }
}
