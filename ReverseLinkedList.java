// Time Complexity : O(n), where n is the number of nodes in the linked list.
// Space Complexity : O(1), since we are using only a few extra variables (prev, curr, next).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach:
// - We maintain three pointers: prev, curr, and next.
// - Traverse the linked list while reversing the `next` pointer of each node.
// - Update prev to curr, and curr to next, moving step by step until curr becomes null.
// - Finally, prev will point to the new head of the reversed list.

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;          // Initially, previous node is null
        ListNode curr = head;          // Start with head node

        while (curr != null) {         // Traverse until end of list
            ListNode next = curr.next; // Save next node
            curr.next = prev;          // Reverse pointer
            prev = curr;               // Move prev forward
            curr = next;               // Move curr forward
        }

        return prev; // New head of the reversed list
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode reversed = sol.reverseList(head);

        System.out.println("\nReversed List:");
        printList(reversed);
    }

    // Helper function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


