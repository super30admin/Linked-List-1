/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
 */
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        
        ListNode tnode = head;
        
        for(int i=1;i<n;i++)
            tnode = tnode.next;
        
        ListNode prev = null;
        ListNode pnode = head;
        
        while(tnode.next !=null)
        {
            prev = pnode;
            pnode = pnode.next;
            tnode = tnode.next;
        }
        
        
        if(prev==null)
        {
            head = head.next;
            return head;
        }
        
        prev.next = pnode.next;
        
        return head;
    }
}