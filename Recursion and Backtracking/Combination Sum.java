class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        combine(0, target,  candidates, new ArrayList<Integer>(), ans);
        
        return ans;
        
    }
    
    public void combine(int ind, int target,int[] arr,ArrayList<Integer> ds, ArrayList<List<Integer>> ans)
    {
        
        if(target == 0) 
            {
              ans.add(new ArrayList<>(ds));
                return;
            }
            
          if(ind == arr.length)
              return;
        
        
        if(arr[ind] <= target) 
        {
        
        ds.add(arr[ind]);
        
        // since n times, the same index can be used.
        // unbounded KnapSack
        combine(ind, target- arr[ind],  arr, ds, ans);
        
        ds.remove(ds.size()-1);
        }
        
        combine(ind+1, target,arr,ds, ans);
        
    }
}
