// TC: O(n)
// SC: O(1)
// Approach: Brute force approach - use hashset
// Optimized approach - if head is null or head.next is null return null
// have 2 pointers slow and fast where slow moves by 1 and fast moves by 2 
// keep moving until fast != null or fast.next != null
// if it is set flaf to false 
// else check if fast and slow values are same and set flag to true

public class LinkedListCycleII {

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  static ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null)
      return null;

    ListNode slow = head;
    ListNode fast = head;
    boolean flag = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        flag = true;
        break;
      }
    }
    if (!flag) {
      return null;
    }

    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }
}