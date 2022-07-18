class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummyNode = new ListNode(-1);
        ListNode result = dummyNode;
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        
        while(p1 != null && p2 != null)
        {
            if(p1.val<p2.val)
            {
                ListNode newNode = new ListNode(p1.val);
                result.next = newNode;
                p1 = p1.next;
            }else{
                ListNode newNode = new ListNode(p2.val);
                result.next = newNode;
                p2 = p2.next;
            }
            result = result.next;
        }
        
       if(p1 != null)
        {
            result.next = p1;
        }
        
         if(p2 != null)
        {
            result.next = p2;
        }
        
        return dummyNode.next;
        
    }
}
