//TC: O(n)
//SC: O(1)
//approach: two pointers

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (null == head || null == head.next) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
