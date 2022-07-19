class Solution {
    public boolean isPalindrome(ListNode head) {
        
        
        if(head == null || head.next == null)
            return true;
        
        ListNode midNode = middleNode(head);
        
        ListNode rightHalf = midNode.next;
        
         midNode.next = null;
        
        ListNode rightHalfReversed = reverseList(rightHalf);
        
        ListNode leftHalf = head;
        
        return compare(leftHalf, rightHalfReversed);
       
        
    }
    
    
     private boolean compare(ListNode l1, ListNode l2){
        
        while(l1 != null && l2 != null)
        {
            if(l1.val != l2.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return true;
    }
    
     private ListNode middleNode(ListNode head){
        
        ListNode fastPtr = head;
        ListNode slowPtr  = head;
        
        while(fastPtr.next != null && fastPtr.next.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr= fastPtr.next.next;
        }
        
         return slowPtr;
        
    }
    
     private ListNode reverseList(ListNode head) {
        
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
