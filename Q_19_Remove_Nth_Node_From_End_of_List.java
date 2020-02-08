package Q_19_Remove_Nth_Node_From_End_of_List;

import java.util.HashMap;


//Given a linked list, remove the n-th node from the end of list and return its head.
//
//Example:
//
//Given linked list: 1->2->3->4->5, and n = 2.
//
//After removing the second node from the end, the linked list becomes 1->2->3->5.
//Note:
//
//Given n will always be valid.
//
//Follow up:
//
//Could you do this in one pass?

//Time Complexity  : O(n)  
//Space Complexity : O(1)

public class Solution {

	
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
//	public class deQueue{
//		ListNode head =null;
//		ListNode tail = null;
//		
//		public deQueue() {
//		head.next = tail;
//		}
//		
//	}
//	
	static ListNode root = new ListNode(1);
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 
		 if(head == null) {
			 return null;
		 }
		 
		 
		 ListNode dummy = new ListNode(-1);
		 dummy.next = head;;
		 ListNode slow = dummy;
		 ListNode fast =dummy;
		 int count =0;
		 
		 while(count <= n) {
			 fast = fast.next;
			 count++;
		 }
		 
		 while(fast != null) {
			 slow = slow.next;
			 fast = fast.next;
		 }
		 
		 
		 slow.next = slow.next.next;
		 
		return dummy.next;
	    }
	 

	 
	public static void main(String[] args) {

		Solution s = new Solution();
		root.next = new ListNode(2);
//		root.next.next = new ListNode(3);
//		root.next.next.next = new ListNode(4);
//		root.next.next.next.next = new ListNode(5);
		System.out.println(s.removeNthFromEnd(root, 2));
	}
	
	

}
