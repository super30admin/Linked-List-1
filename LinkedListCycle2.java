// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head)
    {
        if(head == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        boolean cycleFound = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                cycleFound = true;
                break;
            }
        }
        if(!cycleFound)
            return null;

        while(head != fast)
        {
            head = head.next;
            fast = fast.next;
        }
        return head;
    }
}
