// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

//Create a curr variable and point to head and iterate while Create a temp variable to store the next 
//current and a prev variable to change direction.

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Problem1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode pre = null;
        ListNode temp = current.next;

        while (temp != null) {
            current.next = pre;
            pre = current;
            current = temp;
            temp = temp.next;
        }

        current.next = pre;
        return current;
    }

    public static void main(String[] args) {
        Problem1 reverseList = new Problem1();

        // Constructing a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the linked list
        ListNode reversedHead = reverseList.reverseList(head);

        System.out.println("\nReversed List:");
        printList(reversedHead);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
