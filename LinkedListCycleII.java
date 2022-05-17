// Time Complexity : O(N), N = #Nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode intersection = getIntersection(head);

        if(intersection == null) return null;

        ListNode ptr1 = head;
        ListNode ptr2 = intersection;

        while(ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }

    private ListNode getIntersection(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return slow;
        }

        return null;
    }
}
