// Time Complexity :O(N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null)
        {
            return head;
        }
        
        // detect cycle
        ListNode slow=head;
        ListNode fast=head;
        boolean cycle =false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                cycle=true;
                break;
            }
        }
        
        //find the start point of cycle
         if(cycle)
         {
             slow=head;
             while(slow!=fast)
             {
                 slow=slow.next;
                 fast=fast.next;
             }
             return slow;
         }
        return null;
        
    }
}
