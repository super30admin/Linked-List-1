// Time Complexity : O(n)
// Space Complexity : O(1)
public class RemoveNNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int len = 0;
        ListNode fast = dummy, slow = dummy;
        // move fast pointer at the n
        while(n >=0)
        {
            fast = fast.next;
            n-- ;
        }
        // move fast pointer until it becomes null
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        // slow pointer is one before the node to be removed
        slow.next = slow.next.next;
        return dummy.next;
   }
}