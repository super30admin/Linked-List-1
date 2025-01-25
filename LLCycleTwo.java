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
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode detectCycle(ListNode head) {
       if (head ==null || head.next == null){
        return null;
       }
       ListNode slow = head;
       ListNode fast = head;
        slow = slow.next;
       fast = fast.next.next; 
      while (slow != fast && fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
      if (fast == null || fast.next == null) return null;

      fast = head;
      while (slow != fast){
        slow = slow.next;
        fast = fast.next;
      }
      return fast;
    }
}