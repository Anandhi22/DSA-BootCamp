class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        return preorder(root, ans);
        
    }
    
    private List<Integer> preorder(TreeNode root, List<Integer> ans)
    {
        if(root==null) return ans;
        
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
        
        return ans;
        
    }
}
