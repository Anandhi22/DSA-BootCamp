class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        ListNode dummyNode = new ListNode(-1);
        ListNode result = dummyNode;
        
        int carry = 0;
        
        
        while(l1 != null && l2 != null)
        {
            int currVal = l1.val + l2.val + carry;
            carry = currVal/10;
            ListNode newNode = new ListNode(currVal % 10);
            
            result.next  = newNode;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
       while(l1 != null)
        {
           int currVal = l1.val + carry;
           carry = currVal /10;
           ListNode newNode = new ListNode(currVal % 10);
            result.next  = newNode;
           result = result.next;
           l1 = l1.next;
        }
        
        while(l2 != null)
        {
           int currVal = l2.val + carry;
           carry = currVal /10;
           ListNode newNode = new ListNode(currVal % 10);
            result.next  = newNode;
           result = result.next;
           l2 = l2.next;
        }
        
        if(carry == 1)
            result.next = new ListNode(1);
        
        return dummyNode.next;
        
    }
    
    
}
