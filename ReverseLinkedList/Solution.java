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

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Use two pointers: prev and current. Prev will always stay 1 node behind current. Store current next in temp. Make current next
 * point to prev. Then make prev point to current and move current 1 node ahead using temp.
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}