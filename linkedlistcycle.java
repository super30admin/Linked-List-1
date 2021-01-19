/**
    ListNode temp1 = head;
    ListNode temp2 = head;
    ListNode previous = null;
    
    https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

**/
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        ListNode temp1 = head;
        ListNode temp2 = head;
        
        while( temp1 !=null && temp2!=null)
        {
            temp1 = temp1.next;
            
            temp2 = temp2.next;
            
            if( temp2 == null) 
                return false;
            else
                temp2 = temp2.next;
                
            if(temp1 == temp2)
                return true;
        }
        
        return false;
    }
}