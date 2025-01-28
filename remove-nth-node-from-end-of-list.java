// TC = O(N)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

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
        // TC = O(N), SC = O(1)
        // creating dummy for edge case where the head is deleted
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;
        // creating a gap of n b/w slow & fast
        int counter = 0;
        while(counter++ <= n) fast = fast.next;
        // now move slow too, it will move right behind n (n - 1, where we've to delete)
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}