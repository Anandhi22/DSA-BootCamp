
class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        
        findSubsets(nums, 0 ,new ArrayList<Integer>(), ans);
        return ans;
    }
    
    
    public void findSubsets(int[] nums, int ind, ArrayList<Integer> currentSubset, List<List<Integer>> ans)
    {
        if(ind == nums.length)
        {
            ans.add(new ArrayList<Integer>(currentSubset));
            return;
        }
        
        currentSubset.add(nums[ind]);
        
        findSubsets(nums, ind+1,currentSubset, ans);
        
        currentSubset.remove(currentSubset.size()-1);
        
        findSubsets(nums, ind+1, currentSubset, ans);
    }
}

