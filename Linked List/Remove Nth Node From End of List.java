class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode runner = dummyNode;
        ListNode follower = dummyNode;
        
        for(int i = 1;i<=n;i++)
        {
            runner = runner.next;
        }
        
        while(runner.next != null)
        {
            runner = runner.next;
            follower = follower.next;
        }
        
        follower.next = follower.next.next;
        
        return dummyNode.next;
    }
}
