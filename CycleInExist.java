// Time Complexity : O(n) n is number of nodes 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class CycleInExist {
    ListNode slow;
    ListNode fast;
    public ListNode detectCycle(ListNode head) {
                
        if(head==null) 
            return null;
        
         ListNode overlap = doesCycleExist(head);
        if(overlap == null)
            return null;
        
         fast = head;
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    
    private ListNode doesCycleExist(ListNode head)
    {
        slow = head;
        fast = head;
        
       while(fast!=null && fast.next!=null)
        {
             slow=slow.next;
             fast = fast.next.next; 
                if(slow==fast)
                {
                    return slow;
                }
        }
       return null; 
    }
}