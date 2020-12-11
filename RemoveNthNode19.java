package dec9th2020;

public class RemoveNthNode19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		ListNode dummyNode = new ListNode(-1);
		dummyNode.next = head;
		ListNode start = dummyNode, end = dummyNode;
		for (int i = 0; i <= n; i++)

			end = end.next;

		if (end == null) {
			System.out.println("null here");
		}
		while (end != null) {
			start = start.next;
			end = end.next;
		}
		ListNode extra = start.next;
		start.next = start.next.next;

		if (extra != null) {
			extra.next = null;
		}

		head = dummyNode.next;
		return head;
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
