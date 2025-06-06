// TC: O(n)
// SC: O(1)
// Approach - Have 2 pointers and count variable 
// traverse till count is equal to n and set fast pointer on that position
// once your there just move pointers forward till fast != null
// skip nth node and set nth node to null  

public class RemoveNthNodeFromList {

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;

    int count = 0;

    while (count <= n) {
      fast = fast.next;
      count++;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    ListNode temp = slow.next;
    slow.next = slow.next.next;
    temp.next = null;

    return dummy.next;
  }

}