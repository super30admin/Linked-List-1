// Time Complexity : O(n) both cases
// Space Complexity : O(n) for recursive; O(1) for iterative
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Keep reference for next while updating the current and prev;
// Keep doing it till current reaches null

public class ReverseLinkedList {
    public ListNode reverseListIterative(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {
        // base conditions; returns the last node as head; or if linked list is null
        if (head == null || head.next == null) {
            return head;
        }

        // will always be the last node in any recursion stack
        ListNode res = reverseListRecursive(head.next);
        // point head.next back to head
        head.next.next = head;
        head.next = null;

        return res;
    }

}
