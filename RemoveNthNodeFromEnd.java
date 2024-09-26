// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Approach
//1) Initiate two pointers head and temp, move temp to nth position from head
//2) Iterate both the pointers simulatneously and when the temp pointer reaches null, delete the head pointer
public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode HEAD=head, temp=head;
        while(n>0 && temp.next!=null){
           temp=temp.next;
           n--;
        }
       if(n==1) return HEAD.next;
       if(n>1) return null;
       while(temp.next!=null){
           temp=temp.next;
           head=head.next;
       }
       head.next=(head.next).next;
       return HEAD;
    }
}
