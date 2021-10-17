//TC:O(n)+O(till start of cycle)
//SC:O(1)
//Successfully ran on leetcode
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    public ListNode detectCycle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                ListNode dummy=head;
                while(dummy!=slow)
                {
                    slow=slow.next;
                    dummy=dummy.next;
                }
                return slow;
            }
        }
        return null;

    }
}
