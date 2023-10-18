public class RemoveNthNode {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode faster = start, slower = start;
        for (int i = 1; i <= n; ++i) {
            faster = faster.next;
        }
        while (faster.next != null) {
            slower = slower.next;
            faster = faster.next;
        }
        slower.next = slower.next.next;
        return start.next;
    }
}
