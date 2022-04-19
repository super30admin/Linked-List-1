
class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
}
public class ReverseList {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode prev = null;
        ListNode current = head;
        ListNode fast = head.next;

        while(fast !=null) {
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }

        current.next = prev;

        return current;
    }
}
