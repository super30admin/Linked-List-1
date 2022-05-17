// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

public class LinkedListNNode {
 
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=head;
        ListNode end=head;
        while(n!=0){
            end=end.next;
            n--;
        }
        while(end!=null){
            end=end.next;
            prev=curr;
            curr=curr.next;
        }
        if(head==curr){
            head=head.next;
        }
        prev.next=curr.next;
        return head;
    }
    
}

