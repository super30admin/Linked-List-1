// Time complexity is O(N).
// Space commplexity is O(1)
// Solution is submitted on leetcode

public class BigN49DeletingNFromTheLast {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		// edge
		if (head == null) {
			return null;
		}
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
