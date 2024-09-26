// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**Approach : 3 pointer , recursive, iterative
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 *
 */
public class ReverseLinkedList {
	
	/*
	 * using 3 pointers
	 */
	public ListNode reverseList(ListNode head) {

		if(head==null || head.next==null)
			return head;

		ListNode curr = head, newHead=null, prev=null;

		while(curr!=null)
		{
			ListNode temp = curr;
			curr = curr.next;
			temp.next = prev;
			prev = temp;
		}
		return prev;
	}
	
    /**
     * Iterative solution using explicit stack
     */
    public ListNode iterativeReverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        
        while(head.next != null) {
            st.push(head);
            head = head.next;
        }
        
        ListNode newHead = head;
        
        while(head != null && !st.isEmpty()) {
            head = st.pop();
            head.next.next = head;
            head.next = null;
        }
        
        return newHead;
    }
    
    /**
     * Recursive solution
     */
    public ListNode recursiveReverseList(ListNode head) {
        
        //base - when we hit last node, that is new head
        if(head.next == null) {
            return head;
        }
            
        //logic
        ListNode newHead =  recursiveReverseList(head.next);
        // point heads next node to head and point head to null, swapping of links once node at a time
        //here element is popped out from recursion stack
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
}
