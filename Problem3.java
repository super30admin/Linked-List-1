// Time Complexity : O(N) where N is the total number of ListNodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I took two pointer, slow and fast. Fast will move 2 steps, whereas slow will move 1 pointer.
First, I will check if it is a cycle. If during the traversal, at any point slow == fast, it means it is a cycle.
As per the flyod tortoise and hare algorithm, I will reset the slow pointer to head and increment both fast and slow by 1 step
Wherever slow and fast will meet is the point of cycle.
 */

public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        boolean isCycle = false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                isCycle = true;
                break;
            }
        }

        if(!isCycle) {
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
