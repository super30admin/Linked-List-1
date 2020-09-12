public class RemoveNthLastNode {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int ele) {
            data = ele;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        
        ListNode dummy = head;
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy;
    }

    public void printList(ListNode list) {

        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }

    }
    public static void main(String args[]) {
        RemoveNthLastNode obj = new RemoveNthLastNode();
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        int n = 2;
        list = obj.removeNthFromEnd(list, n);
        obj.printList(list);

    }
}
