// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/*
 * Approach:
 * We use a 2 pointer approach in order to detect a cycle first, and then
 * detect a starting position for the cycle. To detect the starting position
 * of the cycle, we know that once the slow and fast pointers meet, they're the
 * same distance away from the meeting point, regardless of wherever they are.
 * That is why, after finding the cycle, we move them together at 1x speed.
 */

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
        if(head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // detect cycle first
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        // no cycle, so no loop, return
        if(slow != fast) {
            return null;
        }

        // otherwise, cycle is there, detect starting position
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}