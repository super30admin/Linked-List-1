//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
public class LinkedListCycle {
	class ListNode {
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

	public ListNode detectCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		boolean isCycle = false;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				isCycle = true;
				break;
			}
		}
		if (!isCycle)
			return null;
		slow = head;
		while (fast != slow) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

}
