/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//Both solution has time complexity of O(n). Space complexity for iterative solution is O(1) and for recursive it is O(n)
//Iterative
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode currPtr = head;
    ListNode prevPtr = null;
    ListNode nextPtr = null;

    while (currPtr != null) {
      nextPtr = currPtr.next;
      currPtr.next = prevPtr;
      prevPtr = currPtr;
      currPtr = nextPtr;
    }
    return prevPtr;
  }
}

//Recursive
class Solution {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode n = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return n;

  }
}
