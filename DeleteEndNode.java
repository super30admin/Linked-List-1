// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class DeleteEndNode {
    static ListNode head2;
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode start = new ListNode(0);
            ListNode slow = start, fast = start;
            slow.next = head;

            //Move fast in front so that the gap between slow and fast becomes n
            for(int i=0; i<=n; i++)   {
                fast = fast.next;
            }
            //Move fast to the end, maintaining the gap
            while(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            //Skip the desired node
            slow.next = slow.next.next;
            return start.next;
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
        DeleteEndNode list = new DeleteEndNode();
        list.head2 = new ListNode(85);
        list.head2.next = new ListNode(15);
        list.head2.next.next = new ListNode(4);
        list.head2.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(head2);
        list.removeNthFromEnd(head2,2);
        System.out.println("");
        System.out.println("after deleting nth node from Linked list");
        list.printList(head2);
    }
}
