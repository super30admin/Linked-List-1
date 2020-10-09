// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Solution {


    public ListNode interaction(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return slow;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {

        if(head == null  || head.next == null)
        {
            return null;
        }

        ListNode intersect= interaction(head);
        if(intersect == null)
        {
            return null;
        }

        while(intersect != head)
        {
            head = head.next;
            intersect = intersect.next;
        }
        return head;
    }
}
