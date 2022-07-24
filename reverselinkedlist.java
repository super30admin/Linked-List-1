// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode temp=head;
        ListNode prev=null;
        
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        return prev;
    }
}