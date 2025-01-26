package LinkedList;

/**
 * TimeComplextiy O(N)
 * SpaceComplexity : Constant O(1)
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {

        if(head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }


        if( fast == null || fast.next == null || fast.next.next == null) {
            return null;
        }

        slow = head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
