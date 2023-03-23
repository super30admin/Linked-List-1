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

// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code run on Leetcode successfully? : Yes
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;

            // The actual reversing
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}