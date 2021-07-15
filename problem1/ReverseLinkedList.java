// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem1;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
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
		ReverseLinkedList obj = new ReverseLinkedList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.println("List: ");
		obj.printList(head);
		ListNode reversedList = obj.reverseList(head);
		System.out.println("\nReversed List:");
		obj.printList(reversedList);
	}

}
