//TC: O(n)
//SC: O(1)
//approach: two pointers

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        if (null == head.next) return null;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        if (null == right) return head.next;
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }


}
