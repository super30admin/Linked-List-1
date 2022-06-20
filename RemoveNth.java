// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Remove Nth Node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Create a Gap of n between slow and fast
        int count = n;
        while (count >= 0) {
            fast = fast.next;
            count--;
        }

        // Now the gap is n -> Just move both with same speed
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now do it -> slow is just before the node to be deleted
        slow.next = slow.next.next;

        return dummy.next;
    }
}