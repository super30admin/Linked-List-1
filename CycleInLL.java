package linkedlistQ;

public class CycleInLL {
	 public ListNode detectCycle(ListNode head) {
	        if(head==null) return null;
	        ListNode slow=head;
	        ListNode fast=head;
	        boolean iscycle=false;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow==fast) {
	                iscycle=true;
	                break;
	            }
	        }
	        
	        if(!iscycle) return null;
	        fast=head;
	        while(slow!=fast){
	            slow=slow.next;
	            fast=fast.next;
	        }
	        return slow;
	    }

}
