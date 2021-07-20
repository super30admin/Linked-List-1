// Time Complexity : O(N) N-> No of Nodes in List
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class LinkedlistCycleII {

    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        boolean hasCycle = false;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle)
            return null;

        fast = head;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
}