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
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow)
                break;
        }
        
        
        if(fast==null || fast.next==null)
            return null;
        
        fast=head;
        
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return fast;
        
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no