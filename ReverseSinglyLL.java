// Time Complexity : O(n)
// Space Complexity : O(1) , no extra space , O(n) when recursive stack included
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        return prev;
    }
}