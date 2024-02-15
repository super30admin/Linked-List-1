//TC: O(n)
//SC: O(1)
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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag=false;
        ListNode slow;
        ListNode fast;
        slow=head;
        fast=head;
        while(fast!=null&&fast.next!=null)
        {
        
            fast=fast.next.next;
            slow=slow.next;
                 if(fast==slow)
           {
               flag=true;
               break;
           }
         
        }
        if(!flag)
        {
            return null;
        }
        fast=head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
        
    }
}