package sol;


public class LlCycle {
	public class ListNode {
	      int val;
	     ListNode next;
       ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    }
	
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        ListNode f=head;
	        ListNode s=head;
	        ListNode ptr=null;
	        
	       while(f!=null&&s!=null){
	          if(f.next==null||f.next.next==null){ break;}else{f=f.next.next;s=s.next; }
	           if(f==s){ ptr=f; break;}
	          
	           
	           
	       }
	        
	        if(ptr==null){return null;}
	        ListNode p1=f;
	        ListNode p2=head;
	        
	        while(p1!=p2){
	            
	            p1=p1.next;
	            p2=p2.next;
	        }
	        return p1;
	    }
	}
	
}
