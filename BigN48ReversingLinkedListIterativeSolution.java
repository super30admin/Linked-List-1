//Time complexity is O(n)
// Space complexity is O(1) as we are not using any extra space
// This solution is accepted on leetcode

public class BigN48ReversingLinkedListIterativeSolution {
	public ListNode reverseList(ListNode head) {
		// edge case
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		ListNode curr = head;
		ListNode fast = head.next;
		while(fast!=null) {
			curr.next = prev;
			prev = curr;
			curr =fast;
			fast = fast.next;
		}
		curr.next = prev;
		return curr;	
	}
}
