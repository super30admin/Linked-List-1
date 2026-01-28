// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed to be careful with dummy node and pointers.


// Your code here along with comments explaining your approach in three sentences only
// I use two pointers with a dummy node so edge cases like deleting head are handled easily.
// First I move the fast pointer n+1 steps ahead and then move both pointers until fast reaches null.
// Now slow will be just before the node to delete, so I skip that node and return dummy.next.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;

        // move fast pointer n+1 steps ahead
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        // move both pointers until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // delete the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }
}
