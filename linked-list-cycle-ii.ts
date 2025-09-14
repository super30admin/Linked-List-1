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
function detectCycle(head: ListNode | null): ListNode | null {
	if (!head) return null;

	let flag = false;
	let slow = head;
	let fast = head;

	while (fast.next !== null && fast.next.next !== null) {
		slow = slow.next;
		fast = fast.next.next;

		if (slow === fast) {
			flag = true;
			break;
		}
	}

	if (!flag) return null;

	fast = head;

	while (slow != fast) {
		slow = slow.next;
		fast = fast.next;
	}

	return slow;
}
