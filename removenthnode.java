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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        
        int count = 1;
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode previous = null;
        
        while( count < n )
        {
            temp1 = temp1.next;
            count ++;
        }
        
        
        while(temp1.next != null)
        {
            previous = temp2;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        if(previous != null)
            previous.next = temp2.next;
        else if(temp2 == head)
            head = head.next;
        else
            head = previous;
        
        return head;
    }
}