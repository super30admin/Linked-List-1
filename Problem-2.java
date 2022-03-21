// Time Complexity : O(N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return head;
        
        int i=1;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode slow=dummy;
        ListNode fast=dummy;

        while(i++<=n+1 && fast!=null){
            fast=fast.next;
        }
        
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
            
        }
        slow.next=slow.next.next;
        return dummy.next;
        
    }
}