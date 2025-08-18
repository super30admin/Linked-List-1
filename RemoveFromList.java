public class RemoveFromList {
    // Time Complexity : O(L), where L is the length of the linked list.
// Space Complexity : O(1), since we are only using a few extra pointers.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach:
// - Use a dummy node to simplify edge cases (like removing the head).
// - Move the fast pointer n+1 steps ahead so that the gap between slow and fast is n.
// - Move both pointers forward until fast reaches the end.
// - At this point, slow is just before the node to be deleted.
// - Adjust the pointers to remove the nth node from the end.

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum = new ListNode(0);  // Dummy node before head
        dum.next = head;
        ListNode slow = dum;
        ListNode fast = dum;

        // Move fast n+1 steps ahead to maintain gap
        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        // Move both pointers until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete nth node from end
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;  // Free the removed node

        return dum.next;  // Return updated head
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        RemoveFromList sol = new RemoveFromList();
        ListNode updated = sol.removeNthFromEnd(head, 2); // remove 2nd node from end

        System.out.println("\nList after removing 2nd node from end:");
        printList(updated);
    }

    // Helper function to print list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}


