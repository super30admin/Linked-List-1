// Time Complexity :O(n) traverse the whole list
// Space Complexity :O(1) no extra space needed
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution1 {
     //Definition for singly-linked list.
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=head.next;
        // reversing the next pointers using three pointers
        // since fast is moving at 1x speed we check if its not null.
        while(fast!=null){
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;           
        }
        // need to set pointer for last node
        curr.next=prev;
        return curr;
    }
     // reverse a linked list using recursion
     public ListNode reverseList1(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode reversed=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reversed;
    }
}