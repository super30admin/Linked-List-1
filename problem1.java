// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:

/*
 * Approach:
 * 1. We are given the head of a singly linked list and need to reverse the linked list in-place.
 * 2. We use three pointers: `prev`, `current`, and `next` to reverse the links between nodes.
 * 3. Initially, `prev` is set to `null` (since the new tail of the list will point to null), and `current` is set to `head`.
 * 4. We iterate through the list while `current` is not null:
 *    - We save the next node (`next = current.next`) to keep track of the next node.
 *    - We reverse the link (`current.next = prev`), making the current node point to the previous node.
 *    - We move the `prev` pointer to the current node (`prev = current`).
 *    - We move the `current` pointer to the next node (`current = next`).
 * 5. Once we reach the end of the list, `prev` will point to the new head of the reversed list.
 * 6. We return `prev` as the new head of the reversed list.
 */
class problem1

{
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public ListNode reverseList(ListNode head) {

    ListNode prev= null;
    ListNode current=head;
    //  System.out.print(current);
    //  current.printList();
    ListNode next;

    while(current!=null)
    {
        next= current.next;
        current.next= prev;  // changing the next sign
        prev= current;
        current= next;

    }

    return prev;



}}