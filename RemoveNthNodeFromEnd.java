// Maintain 2 pointers, at first move the first pointer by n nodes. Now have a second pointer at the beginning of the list, and while the first pointers next node is not null, 
// move both first and second pointer. When the loop breaks the second pointer will be in the node before the node we need to remove, just change the pointer at this point. 

// Time Complexity : O(n), where n is the number of nodes in the list.
// Space Complexity : O(1)

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0)
            return head;

        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode dummy1 = pre, dummy2 = pre;

        for (int i = 0; i < n; i++) {
            dummy1 = dummy1.next;
        }

        while (dummy1.next != null) {
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
        }

        dummy2.next = dummy2.next.next;

        return pre.next;
    }

    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd rFromEnd = new RemoveNthNodeFromEnd();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        int n = 2;

        ListNode modifiedList = rFromEnd.removeNthFromEnd(head, n);
        rFromEnd.printList(modifiedList);
    }
}
