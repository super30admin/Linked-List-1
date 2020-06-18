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
	public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head, res=null;
        
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast)
            {
                ListNode slow1 = head;
                
                while(slow!=slow1)
                {
                    slow1=slow1.next;
                    slow=slow.next;
                }
                
                return slow;
            }
        }
        return null;
    }
}
