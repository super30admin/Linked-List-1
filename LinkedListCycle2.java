// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: We take two pointers, fast and slow. We move slow by 1 and fast by 2. 
// If there is a cycle, they would surely meet at some node. If they meet, we found a cycle. 
// We reset slow to head and start traversing both, slow and fast, by one place.
// The point where both of them meet again will be our start point for the cycle.

// LC- 142. Linked List Cycle II

public class LinkedListCycle2 {
  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        slow = head;

        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }

        return slow;
      }
    }

    return null;
  }
}
