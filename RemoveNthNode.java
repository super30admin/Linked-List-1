// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* Tow pointers slow and fast are initially pointing to a dummy node.
 * fast pointer is moved until a count is less than or equal to the given n value. After this condition is false, the slow and fast pointer
 * will move one step at a time until fast pointer is null.
 * Now the slow pointer has reached the node just previous to the node which has to be removed; Point the slow's next node as slow's next's next.
 * */

import com.util.customlist.*;
class RemoveNthNode {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode slow = dummy;
		ListNode fast = dummy;
		int count = 0;
		while (count <= n) {
			fast = fast.next;
			count++;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		int n = 2;
		
		System.out.println(RemoveNthNode.removeNthFromEnd(one, n));
	}
	
}