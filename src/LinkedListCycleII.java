/*
 * The complexity of the algorithm is O(n) where n is no of elements.
 * 
 */
public class LinkedListCycleII {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {

		if (head == null)
			return null;

		boolean flag = false;
		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {

				flag = true;
				break;
			}
		}

		if (!flag) {
			return null;
		}

		slow = head;

		while (slow != fast) {

			slow = slow.next;
			fast = fast.next;

		}

		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListCycleII objIn = new LinkedListCycleII();

	}

}
