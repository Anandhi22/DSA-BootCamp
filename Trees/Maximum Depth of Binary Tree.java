class Solution {
    public int maxDepth(TreeNode root) {
        
        return height(root);
    }
    
    private int height(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = 1 + height(root.left);
        int right = 1 + height(root.right);
        
        return Math.max(left,right);
    }
}
