package week4;

public class ReverseLinkedList {

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!= null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode reverse2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = curr.next;
        while(temp!= null) {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;
        return curr;
    }

    public ListNode reverseRecursion(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode rev = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}
