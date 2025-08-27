// Time Complexity : O(n), where n = number of nodes in the linked list. 
//                   Both slow and fast pointers traverse the list at most twice.
// Space Complexity : O(1), as we only use two pointers without extra data structures.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//
// Approach : 
// This uses Floyd’s Cycle Detection algorithm (Tortoise & Hare).
// Step 1: Use slow and fast pointers. Slow moves 1 step, fast moves 2 steps.
//         If there is a cycle, they will meet at some point inside the cycle.
// Step 2: Once they meet, to find the cycle start, reset one pointer to head.
//         Move both slow and fast one step at a time. The point where they meet again 
//         is the start of the cycle.
// Why it works: The math behind Floyd’s algorithm guarantees that the distance from 
// head to cycle start = distance from meeting point to cycle start when moving one step at a time.

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean flag = false;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // cycle detected
                flag = true;
                break;
            }
        }

        // no cycle
        if (!flag) return null;

        // Step 2: Find cycle start
        slow = head; // reset slow to head
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast; // or return slow (both are at cycle start)
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
