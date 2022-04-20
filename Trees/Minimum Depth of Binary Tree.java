class Solution {
    public int minDepth(TreeNode root) {
         return minHeight(root);
    }
    
    private int minHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        
        if(root.right == null)  return 1 + minHeight(root.left);
        else if(root .left == null) return 1 + minHeight(root.right);
        
        else return Math.min(1 + minHeight(root.left),1 + minHeight(root.right));
    }
    
}
