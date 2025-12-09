/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * Approach: Fast pointer initially moves n + 1 nodes starting from the dummy node.
 * Then iterate both slow and fast pointers until fast pointer reaches the end.
 * Slow will stop before the nth node from the end.
 * Remove the nth node
 */
// O(N), O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for (int i = 0; i <= n; i ++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;
    }
}