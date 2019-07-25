package linkedList1;

/*
Idea : 1. Take two pointers, slow (moves 1 step) and fast (moves 2 steps), at head of the list.
	   2. When slow and fast pointers meet, bring in new pointer slow2 (moves 1 step) 
	   
	   Suppose the cycle size is N, distance from first node to start of cycle is A, 
	   slow pointer traveled B units, then fast pointer traveled 2A+2B units. FUll cycle is how much fast pointer
	   has traveled more than the slow pointer after meeting for the first point. 
	   Slow pointer must travel A to reach the point where cycle begins. 
	   We can start another slow pointer at head node, and move both pointers until 
	   they meet at the beginning of a cycle.
	   
	   
Time Complexity : O(l) where l is the length of the list
Space Complexity : O(1) because we used constant extra space.
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/

public class DetectCycleInLinkedList2 {

	static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	}
		 
	public static ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == slow)
			{
				ListNode slow2 = head;
				
				while(slow2 != slow) {
					slow = slow.next;
					slow2 = slow2.next;
				}
				return slow;
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(2); 
	    head.next = new ListNode(5); 
	    head.next.next = new ListNode(4); 
	    head.next.next.next = new  ListNode(7); 
	    head.next.next.next.next = new ListNode(6); 
	  
	    /* Create a loop for testing */
	    head.next.next.next.next.next = head.next.next; 
	  
	    ListNode res = detectCycle(head); 
	    
	    	System.out.println("Loop at " + res.val); 
	  
	    return; 
	}
}
