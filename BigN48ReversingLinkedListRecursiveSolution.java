//Time complexity is O(n)
// Space complexity is O(n)
// the below solution is submitted on leetcode

public class BigN48ReversingLinkedListRecursiveSolution {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode reverse = reverseList(head.next);
		// these below code will be executed
		head.next.next = head;
		head.next = null;
		return reverse;	
	}
}
