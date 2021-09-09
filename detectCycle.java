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
// Time Complexity: O(2n) as 1 traversal is used to findthe cycle and 1 more traversal is being done for the point of cycle.
// Space Complexity: 2 Variables of constant size used. O(1)
// Did you complete it on leet code: yes
// Any problems faced: Needed assistance in slow 2 pointer logic

// Write your approach here
// Idea here is to use 2 pointers to detect a cycle by moving fast pointer 2 steps and slow pointer 1 step a time
// if cycle exists fast and slow pointer are bound to meet at a position
// with x distance from cycle start (moving clockwise) which would be same distance from head of List Node
// we take another pointer slow 2 and run both slow pointers 1 at a time until they meet
// the meeting point is cycle start.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                ListNode slow2 = head;
                while(slow2!=slow) {
                    slow2=slow2.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}