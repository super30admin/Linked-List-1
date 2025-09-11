// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Using slow and fast pointer where slow moves one step and fast moves 2 steps.
 * If fast pointer reaches null, then there is no cycle and we can return.
 * If slow and fast pointers meet, then there is a cycle. We use the mathematical approach to determine the distance travelled for both pointers
 * Slow travelled a+b distance and fast travelled a+2b+c before they met. Since fast travelled half than slow, 2*slow=fast
 * Once the cycle is found, we use this logic to move the fast pointer back to head and move both pointers one step at a time till they meet which will be our cycle root.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return null;

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}