// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int counter = 0;

        while (counter <= n) {
            fast = fast.next;
            counter++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // to ensure the node being removed is collected by garbage collection
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
    }
}