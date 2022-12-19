 
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

public class RemoveNthNode {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        ListNode fast = head;
	        ListNode slow = head;
	        ListNode pre = null;
	        int i=0;
	        
	        while(i<n && fast!=null){
	           fast = fast.next; 
	            i++;
	        }
	        
	        if(fast==null){
	            head= head.next;
	            return head;
	        }
	        while(fast !=null){
	            fast = fast.next;
	            pre = slow;
	            slow = slow.next;
	        }
	        pre.next = slow.next;
	    return head;
	    }
}
