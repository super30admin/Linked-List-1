/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

public class DetectCycle2 {

  public ListNode detectCycle(ListNode head) {
    if (head == null)
      return null;

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    if (fast == null || fast.next == null) {
      return null;
    }

    slow = head;
    while (slow != fast) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
