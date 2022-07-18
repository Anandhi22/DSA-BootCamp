class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode prev = dummyNode;
        ListNode current = head;
        
        while(current != null)
        {
            if(current.val == val)
               prev.next = current.next;
            
            else
                prev = current;
            
            current = current.next;
        }
        return dummyNode.next;
        
    }
}
