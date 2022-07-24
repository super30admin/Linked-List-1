// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Check if Slow and Fast Pointers meet/intersect at any node, If yes then there
    // is a cycle, then return the intersection node
    public ListNode detectIntersect(ListNode head) {

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return slowPointer;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode intersectNode = detectIntersect(head);
        if (intersectNode == null) {
            return null;
        }

        // If nodes interesect, then keep 2 pointers, one at head and other at
        // intersection
        // Keep incrementing these two such that when they meet, it will be the starting
        // point of intersection
        ListNode pointer1 = head;
        ListNode pointer2 = intersectNode;
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;

    }
}