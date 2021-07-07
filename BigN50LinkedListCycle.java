// Time Complexity is O(N).
// Space complexity is O(1) as we are not using any extra space
// This solution is accepted on submitted

public class BigN50LinkedListCycle {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
		
	}
	public ListNode detectCycle(ListNode head) {
		// Edge case
		if (head == null || head.next == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		boolean flag = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				flag = true;
				break;
			}
		}
		if (!flag)
			return null;
		slow = head;
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
