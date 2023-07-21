// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
// We need the move the fast pointer to the end of the linked list and the slow pointer should be n nodes away from it. So that we can remove the node next to slow and connect slow with the slow.next.next.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        //set count=0 to maintain a distance of n nodes between fast and slow
        int count=0;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        //set the slow pointer to dummy
        ListNode slow=dummy;
        //move the pointers until fast reaches null and slow pointer will be at the node previous to the one that is supposed to be removed
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;

        return dummy.next;


    }
}