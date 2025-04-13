// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - Recursively reverse the list by reaching the last node (base case),
//    - Then rewire the next pointers on the way back.
//    - Set head.next = null to prevent cycles.
//    - For iterative: Use a dummy newHead, move one node at a time and reverse next pointers in-place.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    //iterative solution
    //TC - O(n), SC - O(1)
    // public ListNode reverseList(ListNode head) {
    //     ListNode newHead = null;
    //     ListNode curr = head;
    //     while(curr != null) {
    //         ListNode temp = curr.next;
    //         curr.next = newHead;
    //         newHead = curr;
    //         curr = temp;
    //     }

    //     return newHead;
    // }

    //recursive logic for companies like Google
    //TC - O(n), SC - O(n)
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null; //to remove next ptr link in reversing to avoid cycle
        return result;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        ReverseLinkedList rll = new ReverseLinkedList();

        System.out.print("Original List: ");
        printList(head);

        ListNode reversed = rll.reverseList(head); // or use reverseListIterative(head)
        System.out.print("Reversed List: ");
        printList(reversed);
    }
}
