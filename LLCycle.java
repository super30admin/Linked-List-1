public class LLCycle {

  /**
   * // Time Complexity : O(n)
   * // Space Complexity : O(1)
   * // Did this code successfully run on Leetcode : Yes
   * // Any problem you faced while coding this :
   */
  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public ListNode detectCycle(ListNode head) {
    if (head == null)
      return null;
    ListNode slow = head, fast = head;
    if (slow.next == null)
      return null;
    while (slow != null) {
      if (fast == null || fast.next == null)
        return null;
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast)
        break;
    }
    ListNode curr = head;
    while (curr != slow) {
      curr = curr.next;
      slow = slow.next;
    }
    return slow;
  }
}
