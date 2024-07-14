
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
 * TC --> O(n)
 * SC --. O(1)
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return slow;
            }
            fast = fast.next.next;
            slow = slow.next;

        }//while

        return null;

    }
}
