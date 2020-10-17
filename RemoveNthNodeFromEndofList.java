class RemoveNthNodeFromEndofList {
    // Time complexity O(n)
    // Space complexity O(1)
    // Tested in leetcode
    
    public ListNode removeNthFromEnd(ListNode head, int n) {     
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
         
        int count=0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}