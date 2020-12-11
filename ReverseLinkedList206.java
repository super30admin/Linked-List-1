package dec9th2020;

public class ReverseLinkedList206 {

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;
		ListNode reversed = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return reversed;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
