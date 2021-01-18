// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while (n-- > 0) {
            fast = fast.next;
        }

        if (fast == null)
            return slow.next;

        ListNode prev = null;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;

        }

        prev.next = slow.next;
        return head;
    }
}