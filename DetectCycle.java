
import java.util.*;

/**
 * DetectCycle
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        boolean detect = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            // if(!detect)
            fast = fast.next.next;
            // else
            // fast = fast.next;
            if (fast == slow) {
                /*
                 * if(!detect) { fast = head; detect = true; } else return slow;
                 */
                fast = head;
                detect = true;
                break;

            }
        }
        if (!detect)
            return null;
        while (slow != null) {
            if (fast == slow)
                return slow;
            slow = slow.next;
            fast = fast.next;
        }
        return null;

    }

    public static void main(String[] args) {

    }
}