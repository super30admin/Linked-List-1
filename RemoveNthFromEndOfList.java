package linkedList1;

/*
Idea : 1. Take two pointers and dummy node at beginning of the list.
	   2. Move first pointer till we make a gap of 'n' steps. 
	   3. Then advance both pointers till first pointer reaches null node 
	   	  and transfer link of second to next to next node.
Time Complexity : O(l) where l is the length of the list
Space Complexity : O(1) because we used constant extra space.
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/

public class RemoveNthFromEndOfList {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	
	// ONE PASS SOLUTION
		public ListNode removeNthFromEnd(ListNode head, int n) {
		        
		        ListNode temp = new ListNode(0);
		        temp.next = head;
		        ListNode first = temp;
		        ListNode second = temp;
		        
		        for(int i = 1; i <= n + 1; i++) 
		        {
		            first = first.next;
		        }
		        
		        while(first != null) 
		        {
		            first = first.next;
		            second = second.next;
		        }
		        second.next = second.next.next;
		        return temp.next;
		}

	
	
	
	
	/*
	 * TWO PASS SOLUTION
	 * 
	 * TC: the list is traversed twice in both the while loops (length + length - n) O(2l -n)
	 * SC: O(1) because we used constant extra space
	 * 
	 * 
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        
        temp.next = head;
        int length = 0;
        
        ListNode first = head;
        
        while(first != null)
        {
            length ++;
            first = first.next;
        }
        length = length - n;
        first = temp;
        
        while(length > 0) 
        {
            length --;
            first = first.next;
        }
        
        first.next = first.next.next;
        return temp.next;
    }
    */
}
