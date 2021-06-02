package LinkedList1;

/*S30 Big N Problem #50 {Medium} - https://www.youtube.com/watch?v=zo98bi9fXlY
you are given a linked list,you have to remove the n-th node from the end of list and return its head.given n is always valid and solve it in one pass

Example:
Given linked list: 1->2->3->444->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Source Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    Source Link: https://leetcode.com/problems/container-with-most-water/
 -------------------------------------------------------------------------------------------------------
  Time complexity : o(n) 
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
