// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Using 2 pointers fast and slow to detect the cycle
 * If there ia cycle then rebound the head to start and move both the pointers in 1 step 
 * Return the node, where both the pointers meet.
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        boolean flag = false;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                flag = true;
                break;
            }  
        }
        fast= head;
        if(flag == false){
            return null;
        }
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}