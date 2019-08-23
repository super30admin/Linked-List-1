package LinkedLists;
/**
 * Time omplexity: O(n)
 * Space complexity: O(1)
 * Leetcode accepted: yes
 * Problems faced: Tried two-pointer approach, but missed edge conditions in lines 41 & 43 initially
 */
public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode rev = removeNthFromEnd(head, 2);
		while(rev != null) {
			System.out.println(rev.val);
			rev = rev.next;
		}
	}
/**
 * Single Pass Approach: Fix the width between slow and fast equal to n
 * The node next to slow should be the removed node
 */
	private static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) return null;
		
		ListNode fast = head, slow = head;
		
		//Move fast pointer n nodes away from slow pointer
		//Take care that first should not be null
		while(n>0 && fast.next != null) {
			fast = fast.next;
			n--;
		}
		
		//In the end, if n==0 the width is set
		
		//If n is 1, fast reached end and slow is
		if(n==1) return head.next;
		
		//If n>1, given n is greater than that of the length of linkedlist
		if(n>1) return null;
		
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		return head;
	}
}
