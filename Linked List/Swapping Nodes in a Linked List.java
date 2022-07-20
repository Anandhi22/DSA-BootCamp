class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        if( head == null && head.next == null)
            return head;
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode runner = dummyNode;
        ListNode follower = dummyNode;
        ListNode firstPos = dummyNode;
        
        for(int i = 1;i<=k;i++)
        {
            runner = runner.next;
            firstPos = firstPos.next;
        }
        
        
        while(runner != null)
        {
            runner = runner.next;
            follower = follower.next;
        }
        
        int value = follower.val;
        follower.val = firstPos.val;
        firstPos.val = value;
        
        return dummyNode.next;
    }
}
