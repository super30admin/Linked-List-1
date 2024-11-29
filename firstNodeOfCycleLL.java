// Time Complexity : O(n) as we traverse the list once
// Space Complexity : O(1) as we only use pointers to nodes in the LL
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, already knew the formula used in this question, so was easy
// to code


// Your code here along with comments explaining your approach
// The logic behind this is: have 2 pointers, one moving 1 step at a time and the other moving 2 steps.
// If they don't meet, there is no cycle in the list
// If they meet, there is a cycle. Now start another pointer from the head and move it 1 step at a time along
// with the slow/fast pointer. Whereever the 2 pointers meet is the starting point of the cycle.

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

public class firstNodeOfCycleLL {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head, curr = head;
        int n = 1;
        while ((fast != null && fast.next != null) && (slow != fast || n == 1)) {
            slow = slow.next;
            fast = fast.next.next;
            n++;
        }
        while (curr != slow) {
            if (slow.next == null) return null;
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }
}