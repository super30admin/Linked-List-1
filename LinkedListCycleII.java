/*
Time Complexity: O(N) where N is the number of nodes in the linked list.
Space Complexity: O(1) since we are using two pointers and not using any extra space.
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
Intuition: We can use the Floyd's Cycle Detection algorithm (Tortoise and Hare) to detect if there is a cycle in the linked list. If there is a cycle, we can find the starting node of the cycle by resetting one pointer to the head and moving both pointers one step at a time until they meet again.
*/
public class LinkedListCycleII {
    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        // A fast pointer will loop around a cycle and meet the slow
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare)
                return tortoise;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        // If there is a cycle, the fast/slow pointers will intersect at some
        ListNode intersect = getIntersect(head);
        if (intersect == null)
            return null;

        // reset hare to head
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}