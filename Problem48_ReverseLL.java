/**************** Time Complexity: O(n) **************** */
/**************** Space Complexity: O(n) **************** */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

    ListNode prev = null;                   // prev maintaining previous node of the list
	ListNode current = head;                // current is the head of the List

	while (current != null) {               // while we don't reach the end of the list
		ListNode temp = current.next;       // saving the next element in temp variable
		current.next = prev;                // storing next element as prev
		prev = current;                     // iterate
		current = temp;
	}

	return prev;                            // returning the reversede link
    }
}

	