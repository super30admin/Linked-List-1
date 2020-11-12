public class ReverseLL {

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode reversed = reverseList(head.next);
		// st.pop()
		head.next.next = head;
		head.next = null;
		return reversed;
	}

	public static void main(String[] args) {

		ListNode next3 = new ListNode(5, null);
		ListNode next2 = new ListNode(4, next3);
		ListNode next1 = new ListNode(3, next2);
		ListNode next = new ListNode(2, next1);
		ListNode head = new ListNode(1, next);

		ReverseLL node = new ReverseLL();
		ListNode nodeVal = node.reverseList(head);
		System.out.println(nodeVal.val);
	}
}
