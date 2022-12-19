 
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

public class LinkedListReversal {
	 
	  public ListNode reverseList(ListNode head) {
	        ListNode pre = null; 
	        
	        while(head!=null){
	            ListNode temp = head; 
	            head = head.next; 
	            temp.next = pre;
	            pre = temp;
	        }
	        
	        return pre;
	    }
	  
	   public ListNode reverseListRecursive(ListNode head) {
	       // base condition 
	        if(head ==null || head.next==null)
	            return head;
	        
	        ListNode reversed = reverseList(head.next);
	        // st.pop()

	        head.next.next = head;
	        head.next = null;
	        return reversed;
	    }
	  
}
