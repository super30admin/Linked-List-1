// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Returning dummy.next


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		 if(head == null) return null;
		 
		 ListNode dummy = new ListNode(-1);
		 dummy.next = head;
		 ListNode slow = dummy;
		 ListNode fast = dummy;
		 while(n >= 0) {
			  fast = fast.next;
			  --n;
		 }
		 
		 while(fast != null) {
			  fast = fast.next;
			  slow = slow.next;
		 }
		 
		 // ListNode temp = slow;
		 slow.next = slow.next.next;
		 return dummy.next;
	}
}