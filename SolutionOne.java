// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

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

        ListNode dummy=new ListNode();

        if(head==null||head.next==null)
            return head;

        ListNode reversed=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reversed;


       /* ListNode prev=null;
        ListNode current=head;
        ListNode fast=head.next;


        while(fast!=null)
        {
           current.next=prev;
           prev=current;
           current=fast;
           fast=fast.next;
        }
        current.next=prev;

        return current;*/
    }
}