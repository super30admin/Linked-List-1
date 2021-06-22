// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode slow = dummy;
      ListNode fast = dummy;
      int count = 0;
      
      //find the gap;
      while(count <= n) {
        fast = fast.next;
        count++;
      }
      //move the fast pointer till end of the list 
      // slow pointer reaches one step back to the node to be deleted
      while(fast != null) {
        slow = slow.next;
        fast = fast.next;
      }
      slow.next = slow.next.next; // remove the node
      return dummy.next;
    }
}