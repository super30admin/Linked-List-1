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
public class Solution {
    // Approach: Floyd's Tortoise and Hare Algorithm
    /**
     * Take slow (moves one node) and fast (moves two nodes) pointers. When slow and fast meet:
     *  - Travel distance of slow = a + b
     *  - Travel distance of fast = a + b + c + b = a + 2b + c
     * We know fast travelled twice than slow => since slow = (a + b) then fast = 2 * (a + b)
     * => 2 * (a + b) = a + 2b + c => a = c
     * To detect start of cycle, move slow back to head and move slow and fast by one node now.
     * By the time slow travels a distance, fast travels a = c distance. Meeting point is the start of the cycle.
     */
    // Time: O(N); N = number of nodes
    // Space: O(1)
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // slow and fast meet
                flag = true;
                break;
            }
        }
        if (!flag) {
            // no cycle
            return null;
        }
        // cycle found
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}