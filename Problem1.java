// https://leetcode.com/problems/reverse-linked-list/
// Time Complexity : O(N)
// Space Complexity : O(1) ignoring recurison stack
// Did this code successfully run on Leetcode : YES
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public ListNode reverse(ListNode head, ListNode prev) {
        if (head == null)
            return prev;

        ListNode temp = head.next;
        head.next = prev;

        return reverse(temp, head);
    }
}