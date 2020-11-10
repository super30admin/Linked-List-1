// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag=false;
        //if(head==null || head.next==null) return head;
        
        
        //ListNode dummy= new ListNode(-1);
        //dummy.next=head;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
            {
                  flag=true;
                break;
            }
        }
        if(flag==true)
        {
           
        fast=head;
        
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
        }
        return null;
    }
}
