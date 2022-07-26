class Solution {
    public int maxDepth(Node root) {
        
        return height(root);
    }
    
    private int height(Node root)
    {
        if(root == null)
            return 0;
        
        int ans = 0;
        
        for(Node currentChild : root.children)
            ans = Math.max(ans, height(currentChild));
        
         //since, the for loop doesnt run for no children case, adding 1 in return.
        return 1 + ans;
    }
