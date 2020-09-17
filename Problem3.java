// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : used brute force approch before class 

// Your code here along with comments explaining your approach
// take two pointers slow and fast to find intersection point and then return that point
// Once you get intersection point move from head and that intersection point ahead till the
//time that two pointers dont meet
public class Problem3 {
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */

	    public ListNode detectCycle(ListNode head) {
	        if(head==null) return null;
	        
	        ListNode intersect= getIntersection(head);
	        if(intersect==null)
	            return null;
	        ListNode start=head;
	        while(start!=intersect){
	            start=start.next;
	            intersect=intersect.next;
	        }
	        
	        return start;
	        
	    }
	    
	    private ListNode getIntersection(ListNode node){
	        ListNode slow=node;
	        ListNode fast=node;
	        
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            
	            if(fast==slow)
	                return slow;
	        }
	        
	        return null;
	        
	    }
	
}
