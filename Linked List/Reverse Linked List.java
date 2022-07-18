class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode tempNode = null;
        ListNode current = head;
        
        while(current != null)
        {
            tempNode = current.next;
            current.next = prev;
            prev = current;
            current = tempNode;
        }
          
        return prev;
        
    }
}
