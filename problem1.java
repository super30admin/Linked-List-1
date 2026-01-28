/**
Time complexity = O(N);
Space Complexity= O(1);
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : 
Connecting the current pointer back to the list after breaking the connection 

*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){//reverse linking the nodes from the start-null and last node as head
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        
        }
        
        return prev;
    }
}