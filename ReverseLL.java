

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No




public class ReverseLL {

	ListNode head;

	static class ListNode {

		ListNode next;
		int val;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	private ListNode reverseListIterative(ListNode head) {
		
		if(head == null || head.next == null)
			return head;
		
		

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
	}

	public ListNode reverseListRecursive(ListNode head) {
		
		if(head == null || head.next == null)
			return head;
		ListNode reverse = reverseListRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		return reverse;
	}

	private void printLinkedList(ListNode head) {

		ListNode l = head;

		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}

	public static void main(String[] args) {
		ReverseLL d = new ReverseLL();
		d.head = new ListNode(1);
		d.head.next = new ListNode(2);
		d.head.next.next = new ListNode(3);
		d.head.next.next.next = new ListNode(4);
		d.head.next.next.next.next = new ListNode(5);
		d.head.next.next.next.next.next = new ListNode(6);
		d.head.next.next.next.next.next.next = new ListNode(7);
		d.head.next.next.next.next.next.next.next = new ListNode(8);

		ListNode res = d.reverseListIterative(d.head);
		d.printLinkedList(res);
	}

}
