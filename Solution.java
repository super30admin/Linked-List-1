// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast != slow && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == null)
            return new ListNode(-1);

        fast = head;
        int i = 0;

        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
            i++;
        }

        return new ListNode(i);

    }
}