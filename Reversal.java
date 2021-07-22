class Reversal {
    static ListNode head;
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
        Reversal list = new Reversal();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}