// In this problem, we know that if we keep two pointers slow and fast and increment slow by 1 and fast by 2 and if they intersect 
// than there is a cycle. So, to determine head of cycle, reset fast to head and keep slow at wherever they are intersected.
// Now again start a loop till slow not equal to fast, increment both by 1 this time. So, wherever they intersect now, is the start 
// of cycle

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class HeadOfCycle {
    public ListNode detectCycle(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return null;
        }
        // Declare a isCycle variable
        boolean isCycle = false;
        // Declare 2 pointers
        ListNode slow = head;
        ListNode fast = head;
        // Run a loop till end of the linkedlist
        while (fast != null && fast.next != null) {
            // Increment slow by 1
            slow = slow.next;
            // Increment fast by 2
            fast = fast.next.next;
            // At any point, if they meet, there is a cycle, so set the flag to true and
            // break
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        // Check the flag value, if false return
        if (!isCycle) {
            return null;
        }
        // Else if there is a cycle, reset head now to find the start of cycle
        fast = head;
        // Run a loop till they intersect again
        while (slow != fast) {
            // Increment both by 1
            slow = slow.next;
            fast = fast.next;
        }
        // Return any, both will be at the start of cycle only
        return slow;
    }
}