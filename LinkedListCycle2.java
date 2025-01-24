/**
 * Time Complexity: O(n)
 * Space complexity: O(1)
 * Ran on leetcode? Yes
 * issues faced? no
 *
 * Approach:
 *
 * Using a slow and fast pointer, first find if there is a cycle
 * if there is a cycle, set fast to head and move both slow and fast one step at a time till they both become equal.
 */
public class LinkedListCycle2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null;
        }

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
