/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Time Complexity : O(n)
// Space Complexity : O(1)

class LinkedListCycle {
	public ListNode detectCycle(ListNode head) {
		
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow = fast) {
				while(head != slow) {
					head = head.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}
}