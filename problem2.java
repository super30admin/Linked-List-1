// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:

/*
 * Approach:
 * 1. We need to remove the Nth node from the end of the linked list.
 * 2. We use two-pointer technique (slow and fast pointers) to achieve this in one pass.
 * 3. We create a dummy node and point its next to the head of the list. This helps handle edge cases,
 *    such as removing the head of the list.
 * 4. We move the `fast` pointer `n + 1` steps ahead, so there is a gap of `n` nodes between `slow` and `fast`.
 * 5. We then move both `slow` and `fast` pointers one step at a time until `fast` reaches the end of the list.
 * 6. At this point, `slow` is pointing to the node just before the one we need to remove.
 * 7. We update `slow.next` to skip the Nth node from the end, effectively removing it from the list.
 * 8. Finally, we return `dummy.next`, which points to the head of the modified list.
 */

public class problem2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
        slow.next = slow.next.next;

        return dummy.next;
    }
}
