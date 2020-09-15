public class ReverseLL {
	public ListNode reverseList(ListNode head) {
		if (null == head || head.next == null)
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

	public ListNode reverseListRec(ListNode head) {
		if (null == head || head.next == null)
			return head;

		ListNode rev = reverseListRec(head.next);
		// head = stack.pop(); // this wil be hidden in recursive stack
		head.next.next = head;
		head.next = null;

		return rev;

	}
}
