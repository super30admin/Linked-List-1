
public class Problem_1_Iterative {
	
	public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast != null){
            
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        
        return curr;
        
    }

}
