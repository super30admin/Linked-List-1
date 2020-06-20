// Time Complexity : O(N)
// Space Complexity : O(N) [Recursive Stack Space]
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class Reverse_LL_recursive {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode r = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return r;
	}
}