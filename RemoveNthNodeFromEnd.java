/***
 Approach-
 1. First, check if head or head.next is null, then return null.
 2. Move the fast pointer till the given n. If fast pointer becomes null, then return head.next.
 3. If fast pointer is not null, then move both slow and fast pointer one step at a time until fast.next becomes null
 TC - O(n), SC - O(1)
 */

class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;


        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        while(n-- >= 0) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }
}