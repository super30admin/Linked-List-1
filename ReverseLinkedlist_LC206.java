// Time Complexity : O(N) — where N is the number of nodes in the linked list.
// Space Complexity : O(1) — in-place reversal with no extra data structures.
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
class ReverseLinkedlist_LC206 {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null; 

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}