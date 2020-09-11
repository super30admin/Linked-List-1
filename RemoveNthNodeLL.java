class RemoveNthNodeLL {
// Time Complexiy:   O(n)
// Space COmplexity: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        int tmp = n;
        
        // Bringing fast pointer to the nth location to be advanced by n nodes
        while(tmp>0 && fast != null ){
            fast = fast.next;
            tmp--;
        }
        
        // Moving forward until fast pointer is at end, then slow.next will be the
        // required node that is to be removed.
        while(fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        }
        
        // Deleting the node 
        slow.next = slow.next.next;    
        
        return dummy.next;
    }
}
