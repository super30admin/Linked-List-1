// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class remove_nth_from_last {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1);
		ListNode slow = dummy;
		ListNode fast = dummy;
		dummy.next = head;
		int count = 0;
		while (count <= n) {
			fast = fast.next;
			count++;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
}