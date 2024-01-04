// Time Complexity : O(n)
// Space Complexity : O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow, fast;
        slow = fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                slow = head;
                while(fast != slow)
                {
                    slow = slow.next;
                    fast = fast.next;
                }

                return fast;
            }
        }

        return null;
    }
}