public class LinkedList_Cycle_2 {

    // Time: O(n), Space: O(1)
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode ptr1 = getIntersect(head);
        ListNode ptr2 = head;

        if (ptr1 == null) return null;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

    public ListNode getIntersect(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
