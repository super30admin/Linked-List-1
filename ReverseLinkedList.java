// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: We try both recursice and iterative solutions . For the below solution, we maintain two pointers, prev and temp, where prev initially points to null. In each iteration, we assigns temp to the next node of head, then sets head.next to prev, and updates prev to head.
// Finally, move the head to the next node in the original list and repeats the process until head becomes null. The function returns prev, which points to the new head of the reversed list. Also implemented the main fucntion with leetocde input to test the accuracy of code.

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

public class ReverseLinkedList {

    // Recursive
    // public ListNode reverseList(ListNode head) {
    // if(head ==null || head.next ==null) return head;
    // ListNode reversed = reverseList(head.next);

    // head.next.next = head;
    // head.next = null;

    // return reversed;
    // }
    // }

    // Iterative dummy node inside loop

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        int[] values = { 2, 3, 4, 5 };

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

        // Create an instance of ReverseLinkedList
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        // Call the reverseList method
        ListNode reversedHead = reverseLinkedList.reverseList(head);

        // Print the reversed linked list
        printLinkedList(reversedHead);
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
