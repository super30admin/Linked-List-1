// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return head;
        boolean flag = false;  
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
            fast = head;
            while(slow!=fast){
                fast = fast.next;
                slow = slow.next;
                }
        return slow;
    }
}
