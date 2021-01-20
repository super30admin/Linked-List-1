// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Floyd Marshal cycle detetcion algorithm
//Fast ptr will catch up to the slow ptr still in 1st round.

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
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        boolean bCycle = false;
        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)  {
                bCycle = true;
                break;
            }
        }
        if(!bCycle) return null;

        slow = head;  //both are at an equal distance from the head of the cycle.
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}
