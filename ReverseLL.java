package linkedlistQ;

public class ReverseLL {
	 public ListNode reverseList(ListNode head) {
	        ListNode p1= null;
	        ListNode p2= head;
	        while(p2 != null){
	           ListNode p3= p2.next;
	            p2.next= p1;
	            p1=p2;
	                p2=p3;
	            
	        }
	        return p1;
	    }

}
