// Time Complexity = O(n)
// Space Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
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
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        boolean hasCycle = false;
        ListNode slow=head, fast=head;

        // Itterate over the LL nodes and break if the slow and fast pointers meet
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // if the LL does not have cycle, we return null
        if (!hasCycle) {
            return null;
        }

        // slow pointer is reset to head, so that we traverse one step to find the first element of loop.
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}