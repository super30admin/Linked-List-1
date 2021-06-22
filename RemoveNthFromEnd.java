package LinkedList1;

/*Time complexity : o(n) 
  space complexity: o(1) 
  Did this code run successfully in leetcode : yes
  problems faces : create a dummy done -1 before the head, to handle case when n == length of node.
  */

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while (count < n) {
            fast = fast.next;
            count++;
        }

        System.out.println("fast : " + fast.val);

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }

}
