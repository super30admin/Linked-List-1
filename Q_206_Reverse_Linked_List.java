package Q_206_Reverse_Linked_List;

import Q_19_Remove_Nth_Node_From_End_of_List.Solution.ListNode;

//Reverse a singly linked list.
//
//Example:
//
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
//Follow up:
//
//A linked list can be reversed either iteratively or recursively. Could you implement both?
		

//Time Complexity  : O(n)  
//Space Complexity : O(1)

public class Solution {

	
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	static ListNode root = new ListNode(1);

	 public ListNode reverseList(ListNode head) {
		 if(head == null) {
			 return null;
		 }
		 
		 ListNode prev= null;
		 ListNode curr = head;
		 ListNode next = head.next;
		 
		 while(next != null) {
			 curr.next = prev;
			 prev= curr;
			 curr = next;
			 next = next.next;
		 }
		 
		 curr.next = prev;
		 return curr;
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);

		
		Solution s = new Solution();
		System.out.println(s.reverseList(root).val);
	}

}
