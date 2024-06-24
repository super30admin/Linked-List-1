//Time - O(n), Space - O(1)
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1, head);
        ListNode fast = dummy, slow = dummy;
        int count = 0;

        while(count <= n) {
            fast = fast.next;
            count = count+1;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
