/**********************************************Approach 1***********************************************/
// Time Complexity : O(2n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/* First traversal to get the length of the linked list, so that we know the position to remove,
 * Re-traverse the linked list and when the next element is the one we want to remove
 * we just point the current one to the next next element*/

public class RemoveNthNodeFrom_EndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1);  // dummy node, can give any value
		dummy.next = head;  // pointing the dummy node to head of list
		int length = 0;

		ListNode p = head;

		while(p != null) {   // to calculate the length of list
			length++;
			p =p.next;
		}

		length = length - n;    // find the distance from start;

		p = dummy;  // reset p to dummy node, since the difference we want the pointer to go to one less than the node to be removed, so that we can change the next pointers

		while(length > 0){
			length--;
			p = p.next; // going to one less than element to be removed
		}

		p.next = p.next.next;
		return dummy.next;
	}
}

/**********************************************Approach 2***********************************************/
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/* Using two pointers slow and fast, Slow pointer that points to the first node and doesn't move until we reach the node n and put a fast pointer there 
 * move slow and fast pointer until fast is at the last element. 
 * The next node after slow is the one we want to remove. Point its next to next next.*/

class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1); // dummy node, can give any value
		dummy.next = head;  // pointing the dummy node to head of list

		ListNode slow = dummy;
		ListNode fast = dummy;

		int count = 0;
		while(count <= n){ // moving fast n steps till count<=n
			fast = fast.next;
			count++;
		}

		while(fast != null){    // move slow and fast pointer until fast is at the last element 
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next; // point the next pointer of slow to slow's next's next

		return dummy.next;
	}
}
