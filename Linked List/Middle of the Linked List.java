class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode fastPtr = head;
        ListNode slowPtr  = head;
        
        while(fastPtr.next != null && fastPtr.next.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr= fastPtr.next.next;
        }
        
        
        if(fastPtr.next != null)
            return slowPtr.next;
        
        else
           return slowPtr;
        
    }
}
