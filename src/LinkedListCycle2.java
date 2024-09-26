// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


/**
 * Use slow pointer and fast pointer to detect the cycle
 */

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 * 
 *Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.
 */
public class LinkedListCycle2 {
	/**
	 * using slow and fast pointer
	 */
	public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow=head, fast=head;
        
        //iterate till either we reach end of the list or slow == fast
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                break;
            }
        }
        
        // if slow != fast means no cycle
        if(slow != fast) {
            return null;
        }
        
        slow = head;
        
        //start from collision point and head and go ahead one step at a time , meeting point is cycle start point
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
