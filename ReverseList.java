package LinkedLists;

/**
 * Approach: Considering two-pointer technique. One pointer always points to prev node and the other one to the current node
 * At every step, curr pointer changes its direction to prev 
 * Time: O(n)
 * Space: O(1)
 * Leetcode accepted: yes
 * Problems faced: NA
 */
public class ReverseList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
//		ListNode rev1 = reverseList(head);
		ListNode rev = recursiveReverseList(head);
		while(rev != null) {
			System.out.println(rev.val);
			rev = rev.next;
		}
	}

	//Iteration
	private static ListNode reverseList(ListNode head) {
		ListNode prev = null, curr = head;
		while(curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	//Recursion
	private static ListNode recursiveReverseList(ListNode head) {
		return helper(null, head);
	}

	private static ListNode helper(ListNode prev, ListNode curr) {
		//Base Case
		if(curr == null) return prev;
		
		ListNode node = curr.next;
		curr.next = prev;
		return helper(curr, node);
	}
}
