// TC - O(n)
// SC - O(1)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head.next;
        ListNode fast = head.next.next;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                break;
            }
        }

        while (fast != null && fast.next != null) {
            if (slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
        }

        return null;
    }
}
