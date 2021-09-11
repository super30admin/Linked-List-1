// TIME: O(n)
// SPACE: O(1)
// SUCCESS on LeetCode

public class DetectCycleLL {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head.next;
        if (slow == null) return null;
        ListNode fast = head.next.next;
        while(slow != fast) {
            if (fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        while (slow != fast) {
            if (slow == null) return null;
            slow = slow.next;
            fast = fast.next;
        }
        
        
        
        return slow;
    }
}
