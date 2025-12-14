// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Use two pointers with a dummy node to handle edge cases.
// Move the fast pointer n steps ahead, then move both pointers together.
// When fast reaches the end, slow will be just before the node to remove.

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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        // Dummy node to handle edge cases like removing head
        ListNode curr = new ListNode(0);
        curr.next = head;

        ListNode slow = curr;
        ListNode fast = curr;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return curr.next;
    }
}
