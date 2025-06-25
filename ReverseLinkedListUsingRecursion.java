// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(n), due to recursion stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This recursive solution reverses a singly linked list.
// It goes all the way to the last node (base case: head == null or head.next == null),
// then starts reversing pointers on the way back up the call stack.
// `head.next.next = head` sets the next node's next to current, reversing the link.
// `head.next = null` breaks the original forward link.
// Finally, the reversed list head (originally the tail node) is returned.

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
    public ListNode reverseList(ListNode head) {

        // Base case: if list is empty or has only one node, it's already reversed
        if(head == null || head.next == null) return head;

        // Recursively reverse the rest of the list
        ListNode result = reverseList(head.next);

        // Reverse the current node's pointer
        head.next.next = head;
        head.next = null;

        // Return the new head of the reversed list
        return result;
    }
}