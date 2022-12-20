public class Remove_nth_from_end_of_list {

    // Time: O(n), Space: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode slow = preHead, fast = preHead;

        for (int i = 0; i<=n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return preHead.next;
    }
}