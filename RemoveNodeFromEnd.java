/*
Approach

Use fast and slow pointers with a dummy node, and move fast n + 1 steps ahead.
Move both pointers together until fast reaches the end; slow will be just before the node to remove.
Skip the target node using slow.next = slow.next.next and return dummy.next.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class RemoveNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}

