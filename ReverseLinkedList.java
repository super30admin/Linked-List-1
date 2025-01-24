public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode prev = null;
    ListNode curr = head;
    ListNode fast = curr.next;

    while (fast != null) {
      curr.next = prev;
      prev = curr;
      curr = fast;
      fast = fast.next;
    }
    curr.next = prev;
    return curr;
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
