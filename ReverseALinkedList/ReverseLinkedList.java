/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 1-2-3-4-5-6-null
 * 6-5-4-3-2-1-null
 */

//Iterative solution
class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {

		if(head == null || head.next == null) return head;
		ListNode current = head, temp = null;

		while(current.next != null) {
			temp = current.next;
			current.next = temp.next;
			temp.next = head;
			head = temp;
		}

		return head;

	}
}

//Recursive solution
class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) return head;
		return helper(head, head);
	}

	ListNode helper(ListNode head, ListNode current) {
		//Base case
		if(current.next == null) return head;
		ListNode temp = null;

		temp = current.next;
		current.next = temp.next;
		temp.next = head;
		head = temp;

		return helper(head, current);
	}
}