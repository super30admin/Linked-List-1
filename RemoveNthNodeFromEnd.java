public class RemoveNthNodeFromEnd {

    static class ListNode2 {
        int val;
        ListNode2 next;

        ListNode2(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class LinkedList2 {

        static ListNode2 removeNthFromEnd(ListNode2 head, int n) {
            if (head.next == null) return null;
            ListNode2 dummy = new ListNode2(-1);
            dummy.next = head;
            ListNode2 slow = dummy;
            ListNode2 fast = dummy;

            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return dummy.next;
        }

        static void printList(ListNode2 head) {
            ListNode2 current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode2 node1 = new ListNode2(1);
        ListNode2 node2 = new ListNode2(2);
        ListNode2 node3 = new ListNode2(3);
        ListNode2 node4 = new ListNode2(4);
        ListNode2 node5 = new ListNode2(5);

        node1.next = node2;

        System.out.println("Original list:");
        LinkedList2.printList(node1);

        ListNode2 updatedHead = LinkedList2.removeNthFromEnd(node1, 2);

        System.out.println("List after removing 2nd node from end:");
        LinkedList2.printList(updatedHead);
    }
}
