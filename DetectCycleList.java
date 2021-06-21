// Time Complexity : O(n)
// Space Complexity : O(1)
public class DetectCycleList {
   public ListNode detectCycle(ListNode head) {
	    ListNode slow =  head;
	    ListNode fast =  head;
	    boolean flag = false;    
	        
	    while(fast!=null && fast.next!= null) {
	        fast = fast.next.next;
	        slow = slow.next;
	        if (slow == fast){
	            flag = true;
	            break;
	        }
	    }        
	    if(!flag) return null;    
	        fast= head;
	        while(slow!= fast) {
	        fast = fast.next;
	        slow = slow.next;
	            
	        }
	        return slow;
	  
	    }
	
}
