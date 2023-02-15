// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

/**
 * Maintain two nodes prev and curr. Curr points to head and prev is null.
 * Iterate over the list, at each step, make curr.next as prev and update
 * prev as curr and curr as curr.next (before updating to prev) and finally
 * return prev.
 *
 */
class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head;
		ListNode prev = null;
		while (curr != null) {
			ListNode node = curr.next;
			curr.next = prev;
			prev = curr;
			curr = node;
		}
		return prev;
	}
}
