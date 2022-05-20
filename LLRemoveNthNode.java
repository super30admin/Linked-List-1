// Time Complexity : O(N)
// Space Complexity : O(1)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        // to consider the first node as well, for the result
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        // find the distance to be maintained between the node to find and the last node
        while(count < n && fast != null && fast.next != null) {
            count++;
            fast = fast.next;
        }
        ListNode slow = dummy;
        // keep moving both fast and slow in equal speed,
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // modify the next pointer in current slow node
        slow.next = slow.next.next;
        // return the entire list, excluding the dummy node
        return dummy.next;
    }
}