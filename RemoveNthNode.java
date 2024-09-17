


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No



public class RemoveNthNode {
	ListNode head;

	static class ListNode {

		ListNode next;
		int val;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public ListNode remove(ListNode head, int n) {
		
		int count = 0;
		ListNode dummyNode = new ListNode(-1);
		dummyNode.next = head;
		
		ListNode slow = dummyNode;
		ListNode fast = dummyNode;
		
		while(count<=n) {
			count++;
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		return dummyNode.next;

	}

	private void printLinkedList(ListNode res) {

		ListNode l = res;

		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}
	public static void main(String[] args) {
		RemoveNthNode d = new RemoveNthNode();
		d.head = new ListNode(1);
		d.head.next = new ListNode(2);
		d.head.next.next = new ListNode(3);
		d.head.next.next.next = new ListNode(4);
		d.head.next.next.next.next = new ListNode(5);
		d.head.next.next.next.next.next = new ListNode(6);
		d.head.next.next.next.next.next.next = new ListNode(7);
		d.head.next.next.next.next.next.next.next = new ListNode(8);

		
		ListNode res = d.remove(d.head, 3);
		d.printLinkedList(res);
	}

}
