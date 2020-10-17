package linkedList1;

/*
Idea : 1. Start from null node as previous.
	   2. Keep pointing next of current node to previous node.
	   3. Keep moving previous to current and current to next node, until we reach null node.
Time Complexity : O(n) where n is the length of the list
Space Complexity : O(1) as we take extra variables as pointers.
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/

public class ReverseLinkedList {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

	// Iterative solution
	public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) 
        {
            ListNode next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
	
	/*
	 * TC: O(n) where n is the length of the list
	 * SC: O(n) stack space used in recursion
	 * 
	// recursive solution
	public ListNode reverseList(ListNode head) 
	{
	    if (head == null || head.next == null) 
	    {
	    	return head;
	    }
	    
	    ListNode p = reverseList(head.next);
	    
	    head.next.next = head;
	    head.next = null;
	    return p;
	}
	*/
}
