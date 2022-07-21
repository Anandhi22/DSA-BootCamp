public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fastPtr = head;
        ListNode slowPtr= head;
        
        if(head == null)
            return false;
        
        while(fastPtr.next != null && fastPtr.next.next != null)
        {
            if(fastPtr == slowPtr)
                return true;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        return false;
        
    }
