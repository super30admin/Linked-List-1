public class RemoveNthFromEndLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode HEAD = head;
        ListNode temp = head;
        while (n > 0 && temp.next != null) {
            temp = temp.next;
            n--;
        }
       if (n == 1) return HEAD.next;
        if (n > 1) return null;
        while (temp.next != null) {
            temp = temp.next;
            head = head.next;
        }
        head.next = (head.next).next;
        return HEAD;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
/*
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode slow = head;
    ListNode fast = head;

    while (n-- > 0)
        fast = fast.next;
    if (fast == null)
        return head.next;

    while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;

    return head;
}*/
