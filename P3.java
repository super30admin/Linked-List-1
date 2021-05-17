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
//time-o(N)
//space-o(1)
//passed in leetcode-yes

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ) return null;
        if(head.next==null|| head.next.next==null) return null;
        
        ListNode walker= head.next;
        ListNode runner = head.next.next;
        
        while(walker!=runner)
        {
            walker= walker.next;
            if(runner.next!=null && runner.next.next!=null)
            {
                runner= runner.next.next;
            }
            else
            {
                return null;
            }
        }
        
        walker= head;
        while(walker!=runner)
        {
            walker = walker.next;
            runner=runner.next;
        }
        
        
        return walker;
    }
}