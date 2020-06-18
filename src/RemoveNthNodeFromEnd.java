// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**
 * use one pass to find length of list, find nth node from last
 * remove that node
 */

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * 
 *Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 */
public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        if(head.next == null && n == 1) return null;
        
        int cnt = 0; ListNode temp = head;
        
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        
        int loc = cnt-n-1;
        
        if(loc < 0) return head.next;
        
        temp = head;
        while(loc > 0) {
            temp = temp.next;
            loc--;
        }
        
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
}
