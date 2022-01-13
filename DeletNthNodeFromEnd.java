//TC: O(n)
//SC: O(1)
public class DeletNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        dummy.next = head;
        slow = dummy;
        fast = dummy;
        int count = 0;
        while(count < n) {
            fast = fast.next;
            count ++;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
