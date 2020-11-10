// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        //edge
        if(head==null || head.next==null) return head;
        
        ListNode curr=head;
        ListNode prev=null;
        ListNode fast=head.next;
        
        while(fast!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
            System.out.print(prev.val);
        }
        //prev=curr
        //curr.next=prev;
         curr.next=prev;
        return curr;
    }
}
