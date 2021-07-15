// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem3;

public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode fastPtr = head;
		ListNode slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (fastPtr == slowPtr) {
				break;
			}
		}
		if (fastPtr == null || fastPtr.next == null) {
			return null;
		}

		fastPtr = head;
		while (fastPtr != slowPtr) {
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
		return fastPtr;
	}

	public static void main(String[] args) {
		LinkedListCycle2 obj = new LinkedListCycle2();
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = head.next;

		System.out.println("The cycle begins at node with value " + obj.detectCycle(head).val);
	}

}
