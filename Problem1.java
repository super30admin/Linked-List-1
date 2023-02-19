/*
Reverse a Linked List
approach: take 3 pointers for iterative, for recursion, use stack logic
time: O(n)
space: O(n)
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Problem1 {

    static ListNode reverseList(ListNode head) {
        return helper(head);
    }

    static ListNode helper(ListNode head) {
        if (head==null || head.next ==null) return head;
        ListNode reversed = helper(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }

    public static void main(String []args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        ListNode head = reverseList(node1);
        System.out.println("reversed list");
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
        reverseList(null);
    }
}
