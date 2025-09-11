// Time Complexity : O(n) -> worst case traverse through the whole list to remove the element
// Space Complexity : O(1) -> no additional space used
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

 /*
 * Create a gap between the fast and the slow pointer of n nodes
 * Keep moving the fast pointer until the gap of n has achieved
 * When fast will be at null, slow will be one node prev to the node that is to be removed
 * Create a dummy node to handle the edge case like when the element you want to remove is the last or the only element in the list
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);;
        dummy.next = head;

        int count = 0;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null; // free the node to picked by garbage collector, best practice
        return dummy.next;
    }
}