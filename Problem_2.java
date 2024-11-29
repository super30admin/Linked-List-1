
public class Problem_2 {
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        if(head == null){
	            return null;
	        }
	        
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        
	        ListNode slow = dummy;
	        ListNode fast = dummy;
	        int count = 0;
	        
	        while(count <= n){
	            fast = fast.next;
	            count++;
	        }
	        
	        while(fast != null){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        
	        slow.next = slow.next.next;
	        
	        return dummy.next;
	        
	    }

}
