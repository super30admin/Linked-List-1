 
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

public class LinkedListCycle {
	  public ListNode detectCycle(ListNode head) {
	        
	        ListNode fast = head;
	        ListNode slow = head;
	        boolean isCycle=false;
	        
	        while(fast!=null && fast.next!=null){
	            fast = fast.next.next;
	            slow = slow.next;
	            if(fast==slow){
	                isCycle = true;
	                break;
	            }
	        }
	        
	        if(isCycle){
	            slow = head;
	            while(slow!=fast){
	                slow = slow.next;
	                fast = fast.next;
	            }
	            return slow;
	        }
	        
	        return null;
	    }
}
