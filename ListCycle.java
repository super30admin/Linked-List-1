/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        
        ListNode tnode = head;
        ListNode pnode = head;
        
        while(pnode != null && pnode.next !=null)
        {
            tnode = tnode.next;
            pnode = pnode.next.next;
            
            if(pnode == tnode)
            {
                tnode = head;
                
                while(pnode != tnode)
                {
                    pnode = pnode.next;
                    tnode = tnode.next;
                }
                
                return tnode;
                
            }
        }
        
        
        
        return null;
        
    }
}