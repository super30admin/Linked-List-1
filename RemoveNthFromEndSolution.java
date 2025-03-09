// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
class RemoveNthFromEndSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node and point it to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers
        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Skip the nth node
        second.next = second.next.next;

        // Return the new head
        return dummy.next;
    }
}
