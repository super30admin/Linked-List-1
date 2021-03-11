// Time Complexity : O(n), where n is the number of nodes in the list
// Space Complexity : O(1)

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL reverse = new ReverseLL();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode reversedList = reverse.reverseList(head);
        reverse.printList(reversedList);
    }
}
