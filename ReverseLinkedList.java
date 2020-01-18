// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ReverseLinkedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class IterativeSolution {
		public ListNode reverseList(ListNode head) {
			if (head == null || head.next == null)
				return head;
			ListNode prev = null;
			ListNode curr = head;
			ListNode fast = head.next;
			while (fast != null) {
				curr.next = prev;
				prev = curr;
				curr = fast;
				fast = fast.next;
			}
			curr.next = prev;
			return curr;
		}
	}
}
