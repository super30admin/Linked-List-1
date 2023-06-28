// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach:
// We use two pointers, prev and curr, to track the positions in the list. First, we advances the prev pointer n steps ahead. Then move both prev and curr pointers until curr reaches the end of the list. This helps us to finally removes the nth node by updating the prev.next reference. The modified list is returned.
// Also implemented the main fucntion with leetocde input to test the accuracy of code.

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i <= n; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        prev = dummy;

        while (curr != null) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        // // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        int[] values = { 1, 2, 3, 4, 5 };

        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        RemoveNthFromEnd obj = new RemoveNthFromEnd();

        ListNode Head = obj.removeNthFromEnd(head, 2);

        printLinkedList(Head);
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
