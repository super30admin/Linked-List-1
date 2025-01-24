/**
 * Time complexity: O(n); n is list length
 * Space complexity: O(1)
 * Ran on leetcode: Yes
 * Issues faced? No
 *
 * Approach:
 * 1. Have a dummy node pointing to the head.
 * 2. Use two pointers, fast and slow, both starting at the dummy node.
 * 3. Move fast n+1 steps ahead to create a gap of n nodes between fast and slow.
 * 4. Move both pointers until fast reaches the end, then adjust slow.next to skip the target node.
 */
public class RemoveNthNodeFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow, fast;
        slow = dummy;
        fast = dummy;

        int count = 0;
        while (count <= n) {
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
