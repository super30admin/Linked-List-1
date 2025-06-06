public class ReverseLinkedList {

    static class ListNode1 {
        int val;
        ListNode1 next;

        ListNode1(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class LinkedList1 {

        static ListNode1 reverseList(ListNode1 head) {
            if (head == null || head.next == null) return head;
            ListNode1 newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        static void printList(ListNode1 head) {
            ListNode1 current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode1 node1 = new ListNode1(1);
        ListNode1 node2 = new ListNode1(2);
        ListNode1 node3 = new ListNode1(3);
        ListNode1 node4 = new ListNode1(4);
        ListNode1 node5 = new ListNode1(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("Original list:");
        LinkedList1.printList(node1);

        ListNode1 reversedHead = LinkedList1.reverseList(node1);

        System.out.println("Reversed list:");
        LinkedList1.printList(reversedHead);
    }
}
