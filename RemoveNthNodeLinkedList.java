// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Problem#19
 * 
 * Start with a dummy head. Move your fast pointer n steps farther than slow 
 * Move one step forward until fast is null (end of linked list)
 * your slow will be at the node where slow.next can be set to slow.next.next 
 */

public class RemoveNthNodeLinkedList {

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

            fast = fast.next;
            slow = slow.next;

        }

        ListNode temp = slow.next;

        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;

    }
}