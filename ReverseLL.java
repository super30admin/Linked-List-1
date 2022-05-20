/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLL {
  // Time O(N)
  // Space O(1)
  // Did this code successfully run on Leetcode : Yes
  // Any problem you faced while coding this :
  static ListNode head; // head of list

  static class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
      data = d;
      next = null;
    }
  }

  public static ListNode push(ListNode head, int data) {
    ListNode node = new ListNode(data);
    node.next = head;
    return node;
  }

  public static void printList(ListNode head) {
    ListNode ptr = head;
    while (ptr != null) {
      System.out.print(ptr.data + " —> ");
      ptr = ptr.next;
    }
    System.out.println("null");
  }

  // Main solution of the problem
  public ListNode reverseList(ListNode head) {
    ListNode prevNode = null, currNode = head, NextNode = null;
    while (currNode != null) {
      NextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = NextNode;
    }
    return prevNode;
  }

  public static void main(String args[]) {
    int[] keys = { 1, 2, 3, 4, 5 };

    ReverseLL rLL = new ReverseLL();
    ListNode head = null;
    for (int i = keys.length - 1; i >= 0; i--) {
      head = push(head, keys[i]);
    }
    System.out.println("Before Reversing the LinkedList: ");
    printList(head);
    head = rLL.reverseList(head);
    System.out.println("After Reversing the LinkedList: ");
    printList(head);
  }
}
