// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Take two nodes, fast and slow. We move fast node n steps
// into the list. Then we start moving slow node. Thus, when fast node 
// reaches null, our slow is at nth position from the end. Then we delete 
// the slow node.

// LC- 19. Remove Nth Node From End of List

public class RemoveNthNodeFromEndOfList {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null) {
      return new ListNode();
    }

    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;

    for (int i = 0; i < n + 1; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
  }
}
