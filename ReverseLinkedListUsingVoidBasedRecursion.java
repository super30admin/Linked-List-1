// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(1), since we use only a constant amount of extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This is an iterative approach to reverse a singly linked list.
// We maintain two pointers: `prev` (initially null) and `curr` (initially head).
// In each iteration, we reverse the current node's pointer, then advance both `prev` and `curr` one step forward.
// Finally, `prev` will point to the new head of the reversed list.

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
    ListNode resultHead;
    public ListNode reverseList(ListNode head) {

        this.resultHead = null;
        reverse(head);
        return resultHead;
    }
    private void reverse(ListNode curr){
        if(curr == null || curr.next == null){
            resultHead = curr;
            return;
        }
        reverse(curr.next);
        curr.next.next = curr;
        curr.next = null;
        return;
    }
}