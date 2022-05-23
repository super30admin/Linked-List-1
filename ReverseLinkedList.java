/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
 */
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        
        ListNode prev = null;
        
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
}