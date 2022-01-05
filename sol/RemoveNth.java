package sol;




public class RemoveNth {

	public class ListNode {
	      int val;
	     ListNode next;
     ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    }
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        ListNode p1,p2;
	       
	        ListNode dumm= new ListNode(-1);
	        dumm.next=head;
	        p1=dumm;
	        
	        int i=0;
	        while(i<n){
	            
	            p1=p1.next;
	            i++;
	        }
	        
	        p2=dumm;
	        System.out.println(p2.val+" "+ p1.val);
	        while(p1.next!=null){
	        
	            p2=p2.next;
	            p1=p1.next;
	         System.out.println(p2.val+" "+ p1.val)  ;
	        }
	         
	        p2.next=p2.next.next;
	        return dumm.next;
	       
	    }
}
