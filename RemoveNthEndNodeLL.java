// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class RemoveNthEndNodeLL {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public ListNode removeNthFromEnd(ListNode head, int n) {
			if (head == null)
				return head;
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			ListNode slow = dummy;
			ListNode fast = dummy;
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
}
