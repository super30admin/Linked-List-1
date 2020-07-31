// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I first used some extra memory, i then realized
// this can be done without memory

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
     
        ListNode root=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        
        return root;
    }
}