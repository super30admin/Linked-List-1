// Time Complexity : O(n). n is the number of nodes in a linked list
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
             
        ListNode slow=head,fast=head;
        boolean isFastSlowMet=false;
        
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow){
                isFastSlowMet=true;
                break;
            }
                
        }
        
        if(!isFastSlowMet) return null;
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        
        return slow;
        
    }
}
