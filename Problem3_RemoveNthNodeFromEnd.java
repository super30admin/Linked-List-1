// Time Complexity : o(N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        
        ListNode slow=dummy;
        ListNode fast=dummy;
        int count=0;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next; // stopping at prev node and unlinking next node
        
        return dummy.next;
    }
}