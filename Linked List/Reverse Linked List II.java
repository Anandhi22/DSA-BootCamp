class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode current = dummyNode;
        ListNode prev = dummyNode;
        
        for( int i = 0;i<left;i++)
        {
            prev = current;
            current = current.next;
        }
        
        prev.next = reverseList(current, right-left+1);
        
        return dummyNode.next;
        
    }
    
    private ListNode reverseList(ListNode l, int k)
    {
        ListNode current = l;
        ListNode prev = null;
        
        for(int i = 0;i<k;i++)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        l.next = current;
        
        return prev;
    }
}
