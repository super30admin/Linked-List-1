/**
 * Reverse
 */

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes

// Your code here along with comments explaining your approach
/**
 * # 2 pointer approch
 */
public class Remove {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n == 0)
            return head;
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        length = length - n;
        ListNode prev = null;
        current = head;
        if (length == 0)
            return head.next;
        while (length > 0) {
            prev = current;
            current = current.next;
            length--;
            System.out.println(length);
        }
        prev.next = current.next;

        return head;
    }
}
