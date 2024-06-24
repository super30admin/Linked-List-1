//Time - O(n), Space - O(1)
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head ==null) return null;
        ListNode fast = head, slow = head;
        boolean hasCycle = false;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if(hasCycle) {
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
