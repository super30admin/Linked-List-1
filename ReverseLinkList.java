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
    public ListNode reverseList(ListNode head) {
      if(head == null || head.next == null) return head;
      
      // three pointers to reverse the list
      ListNode prev = null;
      ListNode curr = head;
      ListNode fast = head.next;
      
      // move all pointers one step
      while(fast != null){
        curr.next = prev;
        prev = curr;
        curr = fast;
        fast = fast.next;
      }
      curr.next = prev;
      return curr;
    }
}