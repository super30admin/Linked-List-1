public class ListPalindrome {
	ListNode curr = null;
	ListNode prev = null;
	boolean res = false;
	ListNode rest_half;

	public boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		System.out.println();

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			// 1->2->3->2->1
		}
		rest_half = slow;
		reverse(rest_half);
		res = compareLists(head, rest_half);
		return res;
	}

	private boolean compareLists(ListNode head, ListNode slow) {
		// TODO Auto-generated method stub
		ListNode t1 = head;
		ListNode t2 = slow;
		while (t1 != null && t2 != null) {
			if (t1.val == t2.val) {
				t1 = t1.next;
				t2 = t2.next;
			} else
				return false;
		}
		return true;

	}

	private void reverse(ListNode slow) {
		// TODO Auto-generated method stub
		curr = slow;
		ListNode revFast = null;
		while (curr != null) {
			revFast = curr.next;
			curr.next = prev;
			prev = curr;
			curr = revFast;

		}
		rest_half = prev;

	}

	public static void main(String[] args) {

		ListNode node5 = new ListNode(1, null);
		ListNode node4 = new ListNode(2, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(4, node3);
		ListNode node1 = new ListNode(2, node2);
		ListNode head = new ListNode(1, node1);

		ListPalindrome lp = new ListPalindrome();
		System.out.println(lp.isPalindrome(head));

	}
}
