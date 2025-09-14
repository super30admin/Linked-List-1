/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */
// Time complexity - O(n), n = number of nodes
// Space complexity - O(1)
function removeNthFromEnd(head: ListNode | null, n: number): ListNode | null {
	let count = 0;
	let dummy = new ListNode(-1);
	dummy.next = head;

	let slow = dummy;
	let fast = dummy;
	while (count <= n) {
		fast = fast.next;
		count++;
	}

	while (fast !== null) {
		slow = slow.next;
		fast = fast.next;
	}

	let temp = slow.next;
	slow.next = temp.next;
	temp.next = null;

	return dummy.next;
}
