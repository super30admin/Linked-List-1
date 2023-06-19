package linkedList1;

/**
 * 
 * In the iterative approach we use 3 pointers prev, curr and fast. At every
 * step we link curr to prev node and move curr to fast and fast to the next
 * node. In the recursive approach we keep calling recursively till we reach the
 * second last element of the linkedlist and the point element.next.next to
 * element thereby reversing the link at next node at for the curr node every
 * call.
 * 
 * Time Complexity : O(n) for iterative approach O(n) for recursive approach
 * 
 * 
 * Space Complexity : O(1) for iterative aproach O(n) for recursive approach
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  
public class Problem1 {
	ListNode ans = null;
	boolean isIterative = false;

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		if (isIterative) {
			ListNode prev = null;
			ListNode curr = head;
			ListNode fast = head.next;

			while (fast != null) {
				curr.next = prev;
				prev = curr;
				curr = fast;
				fast = fast.next;
			}

			curr.next = prev;
			return curr;

		} else {
			helper(head);
			head.next = null;
			return ans;
		}
	}

	private void helper(ListNode head) {
		// base
		if (head.next == null) {
			ans = head;
			return;
		}

		// logic
		helper(head.next);
		head.next.next = head;

	}

}
