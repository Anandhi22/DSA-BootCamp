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
        
        //adding 1 at the end of each node call, since for loop will not run for null child of any node
        return 1 + ans;
    }
