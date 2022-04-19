
public class RemoveNthNode {
    // Time complexity: O(n)
    // Space complexity: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count != n) {
            count++;
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

}
