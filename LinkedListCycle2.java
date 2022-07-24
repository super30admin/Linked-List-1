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
// time complexity 0(n)
// space complexity 0(n)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        boolean hasNode=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow)
            {
                hasNode=true;
                break;
            }
        }
        if(!hasNode)
        {
            return null;
        }
        slow=head;
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return fast;

    }
}