class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
// Time Complexity : O(n); n = #nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
public class Reverse {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;

        while (curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
}
