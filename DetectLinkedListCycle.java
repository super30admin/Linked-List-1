// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Used Floyd's cycle finding algorithm. If there is a cycle, the fast pointer
// moving at 2x will always meet the slow pointer moving at 1x. When they meet,
// move any pointer to the head and move them together at 1x. The point where they meet
// will be the start of the cycle.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectLinkedListCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // base conditions
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        // cycle not found
        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;

        // starting slow from the beginning
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}