public class linkedListCycle {
    public ListNode findCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        boolean isCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        //finding the meeting point if there is a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }
        //After finding the meeting point set fast as head and slow as meeting point as we get from above now iterate it by one and they will meet at head of loop
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
