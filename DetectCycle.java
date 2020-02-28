

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No



public class DetectCycle {

	ListNode head;

	static class ListNode {

		ListNode next;
		int val;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	private void printLinkedList() {

		ListNode l = head;

		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}

	public ListNode detectCycle() {


		if(head == null)
			return null;
		
		ListNode slow = head;
		ListNode fast = head;
		boolean flag = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				flag = true;
				break;
			}
		}
		
		
		if(!flag) return null;
		
	
		slow = head;
		
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
	
		return slow;
	
	}

	public static void main(String[] args) {

		DetectCycle d = new DetectCycle();
		d.head = new ListNode(1);
		d.head.next = new ListNode(2);
		d.head.next.next = new ListNode(3);
		d.head.next.next.next = new ListNode(4);
		d.head.next.next.next.next = new ListNode(5);
		d.head.next.next.next.next.next = new ListNode(6);
		d.head.next.next.next.next.next.next = new ListNode(7);
		d.head.next.next.next.next.next.next.next = new ListNode(8);
		d.head.next.next.next.next.next.next.next.next = d.head.next.next.next;

	//	d.printLinkedList();
		
		ListNode cycle = d.detectCycle();
		
		System.out.println(cycle.val);

	}

}
