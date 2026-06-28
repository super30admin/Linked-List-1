// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Use slow and fast pointers to detect whether a cycle exists.
// If no cycle is found, return null.
// Reset one pointer to the head and move both one step at a time until they meet at the cycle's starting node.

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean isCycleExists = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                isCycleExists = true;
                break;
            }
        }

        if(!isCycleExists) {
            return null;
        }

        slow = head;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}