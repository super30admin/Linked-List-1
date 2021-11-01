// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

public class LinkedListCycle_II {
	 public ListNode detectCycle(ListNode head) {
	        ListNode slow=head;
	        ListNode fast=head;
	        boolean isCycle=false;
	        while(fast!=null && fast.next!=null){ 
	            fast=fast.next.next;
	            slow=slow.next;
	            if(slow==fast){
	                isCycle=true;
	                break;
	            }
	        }
	        
	        if(!isCycle)return null;
	        
	        while(head!=null && slow!=null){
	            if(head==slow){
	                return head;
	            }
	            head=head.next;
	            slow=slow.next;
	        }
	        
	        return null;
	  }
	 
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
