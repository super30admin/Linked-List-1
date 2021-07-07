// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public ListNode reverseList(ListNode head) {
      //Iterative
      if(head==null || head.next==null){
	return head;
}
ListNode prev=null;
ListNode curr=head;
ListNode fast=head.next;
while(fast!=null){
		curr.next=prev;
		prev=curr;
		curr=fast;
		fast=fast.next;
}
curr.next=prev;
return curr;

        //Recursive
    if(head==null || head.next==null){
	    return head;
}
ListNode r=reverseList(head.next);
head.next.next=head;
head.next=null;
return r;

    }
}