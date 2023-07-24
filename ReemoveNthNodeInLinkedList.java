package LinkedListI;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class ReemoveNthNodeInLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count <= n)
        {
            count++;
            fast = fast.next;
        }
        while(fast !=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp = null;

        return dummy.next;

    }
}
