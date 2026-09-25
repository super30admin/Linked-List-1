/*
Approach

Use slow/fast pointers; slow moves one step and fast moves two steps to detect a cycle.
If they meet, reset slow to head while keeping fast at the meeting point.
Move both one step at a time; where they meet is the start of the cycle.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class Solution {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect whether a cycle exists
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find the beginning of the cycle
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

