/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
public class DetectCycleSolution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle if the list is empty or has only one node.
        }

        ListNode slow = head; // Slow pointer (tortoise)
        ListNode fast = head; // Fast pointer (hare)

        // Detect if there's a cycle using the two-pointer approach.
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step.
            fast = fast.next.next; // Move fast pointer two steps.

            // If slow and fast meet, there's a cycle.
            if (slow == fast) {
                // Find the start of the cycle.
                ListNode start = head; // Pointer starting from head.

                while (start != slow) { // Move both pointers one step at a time.
                    start = start.next;
                    slow = slow.next;
                }

                return start; // Start of the cycle.
            }
        }

        return null; // No cycle found.
    }
}
