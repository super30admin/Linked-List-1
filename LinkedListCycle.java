public class LinkedListCycle {
	public ListNode detectCycle(ListNode head) {
		if (null == head || head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		boolean detectCycle = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				detectCycle = true;
				break;
			}

		}
		if (!detectCycle)
			return null;
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;// or slow means you're moving slow and fast by one only if they meet each other
	}
}
