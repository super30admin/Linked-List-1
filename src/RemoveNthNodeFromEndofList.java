/*
 * The complexity of the algorithm is O(n) where n is no of elements.
 *  */

public class RemoveNthNodeFromEndofList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveNthNodeFromEndofList objIn = new RemoveNthNodeFromEndofList();
	}

}
