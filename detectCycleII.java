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

//T(N) = O(N)
//S(N) = O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        
        if(head==null||head.next==null)
            return null;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                flag=true;
                break;
            }
            
        }
        if(!flag)
        {
            return null;
        }
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
        
    }
}