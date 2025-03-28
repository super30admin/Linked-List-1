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

// Overall Time Complexity : O(n) since we traverse the linked list
// Overall Space Complexity : O(n) for the recursive stack space used for the function call on each node in linked list
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


//Recursively reverse the sublist starting from head.next.
// After recursion returns, point head.next.next back to head to reverse the link.
//Set head.next = null to prevent a cycle and finalize reversal.

class Solution {
    public ListNode reverseList(ListNode head) {
        
    if (head == null || head.next == null) {
            return head;
    }

        // Reverse the rest of the list
    ListNode newHead = reverseList(head.next);

        // Adjust the pointers
    head.next.next = head;
    head.next = null;

    return newHead;
}
}