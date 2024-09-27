// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
        if(head==null || head.next==null)
            return null;
        ListNode fast=head, slow=head;
        
        while(fast!=null && fast.next!=null){
            
            
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                slow=head;
                while(slow!=fast)
                {   
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
            
        }
        return null;
    }
}