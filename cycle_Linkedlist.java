/*

// Time Complexity : if  we have cycle then time complexity is  O(n +m)  where n is the time taken to reach both pointer at same node and 
m is the time taken from where cycle is starting.

// Space Complexity : O(1), we are not using any auxillary space here.

// Did this code successfully run on Leetcode : Yes

*/

/*
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

public class cycle_Linkedlist {

    public ListNode detectCycle(ListNode head) {

        // created dummy node if we don't have cycle and if head is null
        ListNode dummy = new ListNode(-1);

        if (head == null) {
            return dummy.next;
        }
        // creating fast and slow pointers for iterating thorugh linkedlist.

        ListNode fast = head;
        ListNode slow = head;

        // checking for odd and even length linkedlist

        while (fast.next != null && fast.next.next != null) {

            // fast has 2x speed and slow has 1x speed.
            fast = fast.next.next;
            slow = slow.next;

            // if we reach at same pointer then changing the reference of slow to head.

            if (fast == slow) {

                slow = head;
                // terminating condition

                while (slow != null) {

                    if (fast == slow) {
                        return slow;
                    }
                    fast = fast.next;
                    slow = slow.next;
                }

            }
        }

        // if we don't have cycle
        return dummy.next;

    }
}
