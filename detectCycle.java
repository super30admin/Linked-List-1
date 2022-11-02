// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

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
		 
		 if(head == null || head.next == null) return null; 
		 
		 ListNode slow = head;
		 ListNode fast = head;
		 
		 boolean flag = false;
		 
		 while (fast != null && fast.next != null) {
			  slow = slow.next;
			  fast = fast.next.next;
			  if (fast == slow) {
					flag = true;
					break;
			  }
		 }
		 
		 if(!flag) {
			  return null;
		 }
		 
		 slow = head;
		 while (fast != slow) {
			  fast = fast.next;
			  slow = slow.next;
		 }
		 return slow;
	}
}