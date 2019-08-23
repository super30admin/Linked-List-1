/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Time Complexity : O(n)
// Space Complexity : O(1)

 class RemoveNthElementFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode tempHead = head, tempEnd = head;
		while(n > 0 && tempEnd.next != null) {
			tempEnd = tempEnd.next;
			n--;
		}

		if(n == 1) return head.next;
		if(n > 0) return null;

		while(tempEnd.next != null) {
			tempHead = tempHead.next;
			tempEnd = tempEnd.next;
		}
		tempHead.next = tempHead.next.next;

		return head;
	}
}