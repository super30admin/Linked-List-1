// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class RemoveNthFromEnd
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummy = new ListNode(99);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;
    }
}
