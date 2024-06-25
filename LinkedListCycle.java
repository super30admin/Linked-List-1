public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        boolean isCyclePresent = false;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                isCyclePresent = true;
                break;
            }
        }

        if(isCyclePresent) {
            fast = head;
            while(fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
        return null;
    }
}
