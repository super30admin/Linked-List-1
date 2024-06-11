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

// Time Complexity : O(n) => As we iterate over the n nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Use slow and fast pointer which points to head. Then start moving fast pointer 2x and slow pointer 1x. Keep on checking if slow and fast becomes equal, it indicates there is a cycle. Once it is deteremined there is a cycle reset one of the pointers to head, then keep moving fast and slow pointer 1x and once again they will intersect at the start of the cycle
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }

        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;

        //Move fast 2x and slow 1x
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }

        slow = head;

        //Move both slow and fast 1x
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
}