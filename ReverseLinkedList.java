// Time Complexity : O(n)
// Space Complexity : O(1) if we ignore the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



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

        return  reverse(head);
    }

    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode reverse = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}
