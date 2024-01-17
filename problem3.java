// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

 //  two-pointer approach with a fast pointer and a slow pointer.
//  If there is a cycle, the two pointers will eventually meet at some point within the cycle.
public class problem3 {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            // Check if the fast pointer meets the slow pointer
            if (slowPointer == fastPointer) {
                break;
            }
        }

        if (fastPointer == null || fastPointer.next == null) {
            return null;
        }

        fastPointer = head;

        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return slowPointer;
    }
}
