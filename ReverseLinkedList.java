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

// Approach: Recursive approach - using only head node
// Time: O(N)
// Space: O(N) for recursive stack
class Solution {
    public ListNode reverseList(ListNode head) {

        // base
        if (head == null || head.next == null) { // return the last node
            return head;
        }

        // recurse
        ListNode reversed = reverseList(head.next);

        // logic
        head.next.next = head;
        head.next = null;

        // return
        return reversed;
    }
}