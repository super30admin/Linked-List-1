// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/** Brute force we can use Hashset which stores the nodes. Before adding the node,
 check if the hashset contains the node, if node is present then it is a cycle */
/** Optimized approach - USing 2pointers - fast and slow. slow moves one step and fast moves 2 steps.
 *  If both fast and slow pointers meet, then there is a cycle.
 *  Once cycle is detected, to find the head node of the cycle, need to reset either slow or fast to head and then move both pointers one step.
 *  if both pointers meet, then that will be the head.
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
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {

        ListNode slow= head;
        ListNode fast = head;

        // detecting the cycle
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }


        if(fast == null || fast.next == null){
            return null;
        }

        // once the cycle is detected, need to find the index so resetting fast to head
        fast = head;

        // moving both pointers one step to find the head
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}