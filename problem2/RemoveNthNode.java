// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem2;

public class RemoveNthNode {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode fastPtr = dummyHead;
		ListNode slowPtr = dummyHead;

		for (int i = 1; i <= n + 1; i++) {
			fastPtr = fastPtr.next;
		}

		while (fastPtr != null) {
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}

		slowPtr.next = slowPtr.next.next;

		return dummyHead.next;
	}

	public void printList(ListNode head) {
		ListNode temp = head;
		while (temp.next != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.val);
	}

	public static void main(String[] args) {
		RemoveNthNode obj = new RemoveNthNode();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.println("List: ");
		obj.printList(head);
		ListNode newList = obj.removeNthFromEnd(head, 2);
		System.out.println("\nNew list:");
		obj.printList(newList);
	}

}
