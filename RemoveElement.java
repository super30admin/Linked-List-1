public class RemoveElement {
    // TC is O(n)
    // SC is constant
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return head.next;
        ListNode slow = head;
        ListNode fast = head;
        int i=0;
        while(i<n){
            fast = fast.next;
            i++;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}
