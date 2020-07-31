/****************************Approach 1: Iterative***************************/
// Time Complexity : O(n), n is the length of the list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/* Using three pointers, reverse the pointers at each point and making sure we don't loose track of the next point
 * by keeping a fast pointer. At the end of traversal each node will be pointing at the opposite direction*/

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Reverse_LinkedList {
	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)	// base condition, if 0 node or 1 node 
			return head;

		ListNode prev = null;
		ListNode curr = head;
		ListNode fast = head.next;	// fast pointer, so we dont loose the connection to next node where curr is supposed to go

		while(curr.next != null){ 	// till the next node is null
			curr.next = prev;	 // change the direction of currentNode.next to point to prev
			prev = curr;	// point prev to current 	
			curr = fast;	// point curr to fast 
			fast = fast.next;	// shift fast to next position
		}
		curr.next = prev;	// as the loop misses the last node, so change the currentNode.next to point to prev

		return curr;    
	}
}


/****************************Approach 2: Recursive***************************/
//Time Complexity : O(n), n is the length of the list
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


class Solution {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)	// base condition, if 0 node or 1 node 
			return head;

		ListNode reverse = reverseList(head.next);	// call reverse on head.next and point the last call to node as reverse

		// head = st.pop() happens
		head.next.next = head;	// traverse head.next.next and set as head
		head.next = null;	// make the pointer null which exists between head and head.next node

		return reverse;	// return the list starting at the last element when stack is empty
}
