// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Problem: 142
 * 
 * Two steps:
 * 1. detect cycle -> fast pointer goes 2x while slow goes 1x -> if the fast & slow meet then we have a circle
 * 2. find node -> the distance of the intersection from head is same as the distance from the point where fast and slow meet.
 * 
 * distance covered by slow (a+b) 
 * distance covered by fast a+b+c+b
 * a=c i.e.,
 * 
 * 
 * 
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycleFound = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycleFound = true;
                break;
            }
        }

        if (!isCycleFound)
            return null;

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}