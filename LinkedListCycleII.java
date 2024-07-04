/**
    L.C 142. Linked List Cycle II

    Approach: Two pointers approach

    Working:

        traverse the list
            move slow pointer 1 step
            move fast pointer 2 step
            when slow meets fast ensures that the list has a cycle
                break out for the traversal

        if the list does not have cycle
            return null
        reset fast pointer to head
        traverse the list again till slow != fast
            move slow pointer to 1 step
            move fast pointer to 1 step

        return fast which is the meeting point of the list

    Time Complexity: O(n)
    Space Complexity: O(1)



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
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        if(head == null) {
            return null;
        }

        boolean hasCycle = false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }

        //no cycle is present
        if(!hasCycle) {
            return null;
        }

        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
