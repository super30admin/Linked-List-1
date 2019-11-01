class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast= dummy, slow= dummy;
        int count=0;
        while(count != n){
            fast = fast.next;
            count++;
        }
        
        while(fast.next!= null){
            fast= fast.next;
            slow= slow.next;
            
        }
        
        slow.next = slow.next.next;
     
        return dummy.next;
    }
}
