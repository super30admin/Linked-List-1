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
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//used two pointer approach Slow and fast pointer to create the space of n between two pointer 
//and then increated both fast and slow at same rate till fast !=null
//linked the slow.next =slow.next.next;
//and then return head using dummy.next
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head==null){
          return null;
      }  
      ListNode dummy=new ListNode (-1);
      dummy.next=head;
      ListNode slow=dummy;
      ListNode fast=dummy;
      int count=0;
      while(count<=n){
          fast=fast.next;
          count++;
      }
      while(fast !=null){
          slow=slow.next;
          fast=fast.next;
      }
      slow.next=slow.next.next;
      return dummy.next;
    }
}
