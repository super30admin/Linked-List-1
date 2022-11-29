/**
 * TC - O(n) where n is total number of nodes in linkedlist
 * SC - O(1)
 */
public class LinkedListCycle2 {
    private class ListNode {
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

    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;

        while(fast.next != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
