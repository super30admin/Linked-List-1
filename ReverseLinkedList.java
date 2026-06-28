// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Traverse the linked list while maintaining previous, current, and next pointers.
// Reverse each node's next pointer to point to the previous node.
// Move the pointers forward and return the new head after the traversal completes.

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}