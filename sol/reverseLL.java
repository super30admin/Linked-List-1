package sol;
import java.util.*;
public class reverseLL {
	
	public class ListNode {
		      int val;
		     ListNode next;
	         ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		    }
	
	 public ListNode head1= new ListNode();
	    
	    
	    public ListNode reverse(ListNode head){
	        
	        
	        if(head==null){
	            
	            return null;
	        
	        }
	        
	        
	        if(head.next==null){
	            
	            head1.val=head.val;
	            head1.next=head.next;
	            return head;
	        }
	        
	        ListNode r=reverseList(head.next);
	       
	        r.next=head;
	       head.next=null;
	        
	        return head;
	    }
	    
	    public ListNode reverseList(ListNode head) {
	        
	        reverse(head);
	        return head1;
	        
	    }
}
