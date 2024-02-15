//TC: O(n)
//SC: O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr;
        ListNode fast;
        if(head==null)
        return null;
        prev=dummy;
        curr=head;
        fast=curr.next;
        while(curr.next!=null)
        {
            curr.next=prev;
            //prev.next=null;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        head.next=null;
        return curr;
    }
}