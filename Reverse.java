/**
 * Reverse
 */

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes

// Your code here along with comments explaining your approach
/**
 * 3 pointer approch
 */
public class Reverse {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null; // null
        ListNode current = head; // 1
        ListNode next = head.next; // 2

        while (current.next != null) {
            current.next = prev; // 1.next = null
            prev = current; // prev =1
            current = next; // current = 2
            next = current.next; // next = 3
        }
        current.next = prev;

        return current;
    }
}