/**
 * Leetcode 142. Linked List Cycle II
 * Link: https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
public class LinkedListCycle2 {
    /**
     * first detect cycle using slow and fast pointers running at 1x and 2x speed, if there is cycle
     * they both will meet. Once they meet reset the fast to head and let both pointers sun at 1x speed
     * their next meeting point will be at the head of the cycle
     *
     * TC: O(n) SC: O(1)
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                break;
            }
        }

        if (fast != slow) {
            return null;
        }
        fast = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
