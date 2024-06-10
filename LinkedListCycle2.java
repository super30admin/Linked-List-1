/***
 TC - O(n)
 SC - O(1)
 */

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {

        if(head == null)
            return null;

        boolean isCyclePresent = false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                isCyclePresent = true;
                break;
            }
        }

        if(!isCyclePresent)
            return null;

        fast = head;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;

    }
}