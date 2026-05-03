// Time Complexity :O(M+N) where M is the number of nodes before the cycle and 
// N is the number of nodes in the cycle
// Space Complexity :O(1) as we are using constant space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Why we moved the slow pointer to head after detecting the cycle and how it helps in finding the start of the cycle.


// Your code here along with comments explaining your approach
// We will use the Floyd's Tortoise and Hare algorithm to detect the cycle.
//  We will have two pointers, slow and fast.
// We will move the slow pointer by one step and the fast pointer by two steps.
// If there is a cycle, the fast pointer will eventually meet the slow pointer.
// Once we detect the cycle, we will reset the slow pointer to the head of the list and move both pointers one step at a time until they meet again.
// The point at which they meet will be the start of the cycle.
// We will return the node where they meet as the start of the cycle.
//  If there is no cycle, we will return null.
// The time complexity of this algorithm is O(M+N) where M is the number of nodes before the cycle and N is the number of nodes in the cycle. The space complexity is O(1) as we are using constant space.
class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // find cycle start
        if (hasCycle) {
            slow = head;

            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }

        return null;
    }
}