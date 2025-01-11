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

/*
    Leetcode problem 142: Linked List Cycle II
    T.C: O(n) :: S.C: O(1)

    Solved using Two pointers: Fast and Slow. Fast moves 2x the speed and 
    Slow moves 1x the speed, the fast will meet slow if there is a cycle in
    the Linked List. Now if we consider a to be distance until start of cycle
    b to be the distance from start to the point where fast and slow meet, and 
    c be the rest of the distance from the point where the meet until the start of the cycle.
    We get the equation speed1 * distance2 = speed2 * distance1 (i.e 2 * (a + b) = a + 2b + c)
    Solving the equation we get a = c! Hence the rest of the distance that has to
    be covered by slow is equal to the distance from the head until the start of the cycle.
    
    We can move the fast to head and move them both by 1, now the point at which they meet is
    the node that is expexted to be returned. If there is no cycle (i.e fast.next == null) return null!
*/

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {                
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                fast = head;
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return null;

        while (hasCycle && fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}