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
function reverseList(head: ListNode | null): ListNode | null {
	let prev = null;
	let curr = head;

	while (curr !== null) {
		let temp = curr.next;
		curr.next = prev;
		prev = curr;
		curr = temp;
	}
	return prev;
}
