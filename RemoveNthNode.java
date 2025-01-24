/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

public class RemoveNthNode {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next == null) {
      return null;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;
    for (int i = 0; i <= n; i++) {
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
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
