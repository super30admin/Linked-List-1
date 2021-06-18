// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/*
 * 1. create a dummy node as a head of the list
 * 2. move second pointer n times.
 * 3. when end pointer at the end of the list first pointer will be at n-1'th element.
 * 4. point n-1 node next to n+1 node.
 */
public class RemoveNthNode {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummy = new ListNode(-1);
		dummy.next = head;

		ListNode fistPointer = dummy;
		ListNode secondPointer = dummy;

		for (int i = 0; i < n; i++) {
			secondPointer = secondPointer.next;
		}

		while (secondPointer.next != null) {
			fistPointer = fistPointer.next;
			secondPointer = secondPointer.next;
		}

		fistPointer.next = fistPointer.next.next;

		return dummy.next;

	}
}

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
