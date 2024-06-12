// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null; // prev pointer
        ListNode curr = head; // curr pointer
        ListNode next = curr.next; // next pointer

        while (curr.next != null) {
            curr.next = prev; // starts with pointing to null
            prev = curr; // becomes current
            curr = next; // current becomes next
            next = next.next; // next goes ahead
        }
        curr.next = prev; // last node to point to second last node
        return curr;
    }
}