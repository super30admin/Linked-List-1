public class RemoveNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(1);
        dummy.next = head;
        head = dummy;
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (count < n) {
            count++;
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }

    public class ListNode {
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
}
// O(n)
