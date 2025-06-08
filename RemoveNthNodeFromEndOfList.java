

class RemoveNthNodeFromEndOfList {

    /**
     * Time Complexity: O(2n) = O(n)
     * Space Complexity: O(1) - (in-place)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        // First pass: Count the number of nodes
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int result = count - n;

        // If the head node itself needs to be removed
        if (result == 0) {
            return head.next;
        }

        // Second pass: Find the (count-n)th node
        ListNode curr = head;
        while (result > 1) {  // We stop at the node before the one to delete
            curr = curr.next;
            result--;
        }

        // Delete the nth node from the end
        curr.next = curr.next.next;

        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 5 -> 8 -> 2 -> 3 -> 19
        ListNode head = new ListNode(5);
        head.next = new ListNode(8);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(19);

        System.out.println("Original list:");
        printList(head);

        int n = 2; // Remove 2nd node from end (which is 3)
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode updatedHead = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printList(updatedHead);
    }
}
