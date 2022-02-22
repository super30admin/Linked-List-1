// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: We keep two pointers, prev and curr and keep
// reversing them at every point. We create a temp variable
// to store next node. We them swap the prev and curr and 
// then make curr = temp.

// LC- 206. Reverse Linked List

public class ReverseLinkedList {
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

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }

    ListNode curr = head, prev = null;
    while (curr != null) {
      ListNode tmp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = tmp;
    }

    return prev;
  }
}
