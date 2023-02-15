// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/**
 * To avoid corner cases like only 1 element is present in the list and
 * that has to be removed, then directly returning head will not work since
 * the output will be null. To avoid that, add a new node before head and 
 * take two nodes a & b pointing to it. Now iterate till nth node (included)
 * with b. Then iterate b till it is null. in each iteration, move a forward.
 * this way, we will have n nodes between a & b, then make a.next as a.next.next
 * return temp node.next.
 *
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		ListNode a = temp;
		ListNode b = temp;
		temp.next = head;
		int i = 0;
		while (b != null && i++ <= n) {
			b = b.next;
		}
		while (b != null) {
			a = a.next;
			b = b.next;
		}
		if (a != null)
			a.next = a.next.next;
		return temp.next;
	}
}