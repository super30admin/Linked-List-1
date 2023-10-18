public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode newHead = null;
        while (current != null) {
            ListNode temp = new ListNode(current.val);
            temp.next = newHead;
            newHead = temp;
            current = current.next;

        }
        return newHead;
    }
}
