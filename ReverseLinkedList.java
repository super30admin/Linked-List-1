/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 * Using 3 pointers - prev, curr and fast, we are able to update curr's next to previous and update current to fast.
 * Eventually returning current which is the new head.
 */
public class ReverseLinkedList {

      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     
    // Using 3 pointers - prev, curr, fast
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
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
}
