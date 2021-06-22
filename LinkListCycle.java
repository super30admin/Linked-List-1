// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      boolean flag = false;
      
      //move slow pointer by one step and fast pointer by 2 step
      while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) { //if both the pointer meets then cycle found
          flag = true;
          break;
        }
      }
      if(!flag) return null;
      //find the head of the cycle
      fast = head;
      while(slow != fast) {
        slow = slow.next;
        fast = fast.next;
      }
      return slow;
      
    }
}