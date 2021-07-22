public class Cycle2 {
    static ListNode head3;
        private ListNode getIntersect(ListNode head) {
            ListNode tortoise = head;
            ListNode hare = head;
            while (hare != null && hare.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;
                if (tortoise == hare) {
                    return tortoise;
                }
            }
            return null;
        }

        public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode intersect = getIntersect(head);
            if (intersect == null) {
                return null;
            }
            ListNode ptr1 = head;
            ListNode ptr2 = intersect;
            while (ptr1 != ptr2) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            return ptr1;
        }
    void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        Cycle2 list = new Cycle2();
        list.head3 = new ListNode(85);
        list.head3.next = new ListNode(15);
        list.head3.next.next = new ListNode(4);
        list.head3.next.next.next = new ListNode(20);

        list.head3.next.next= list.head3.next;

        System.out.println("loop found at :"+list.detectCycle(head3));
    }
}
