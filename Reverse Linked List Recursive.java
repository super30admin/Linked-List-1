// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        //edge 
        if(head==null ||head.next==null) return head;
        
         return helper(head);
        
    }
    private ListNode helper(ListNode head)
    {
        //edge
        if(head==null ||head.next==null) return head;
       ListNode reverse= helper(head.next);
       head.next.next=head;
       head.next=null;
        return reverse;
    }
}
