// Time Complexity O(n)
// Space complexity O(1)
// Runs on LeetCode YES
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
public class LLCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (flag == false) {
            return null;
        }
        slow = head;

        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}