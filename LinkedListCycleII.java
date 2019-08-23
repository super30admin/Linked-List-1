package LinkedLists;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Leetcode accepted: yes
 * Problems faced: Understanding the algorithm to solve this problem without extra space
 */
public class LinkedListCycleII {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(-4);
		head.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println(detectCycle(head).val);
        System.out.println(detectCycleUsingSpace(head).val);
	}
	/**
	 * Time: O(n)
	 * Space: O(1)
	 */
	public static ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) {
            return null;
        }
		//As per Floyd’s Cycle-Finding Algorithm, move slow by one step, move fast by two steps
        ListNode slow = head.next;
		ListNode fast = head.next.next;
		while(fast != null && fast.next != null && slow != fast) {
			slow = slow.next;
			fast = fast.next.next;
		}
		//If the above while loop exited because of any of the first two conditions, it means no loops exist
		if(fast == null || fast.next==null) return null;
		
		// Else, loop exists. To find the starting point of loop, bring any of the pointers back to the head and move one step at a time
		fast = head;
		while(fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		//Node at which they meet for the first time, is starting node
		return fast;
    }
	/**
	 * Time: O(n)
	 * Space: O(n)
	 */
	public static ListNode detectCycleUsingSpace(ListNode head) {
		HashSet<ListNode> hs = new HashSet<ListNode>();
		ListNode curr = head;
		while(curr != null) {
			if(!hs.contains(curr)) {
				hs.add(curr);
			} else {
				return curr;
			}
			curr = curr.next;
		}
		return null;
	}
}
