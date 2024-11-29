
public class Problem_1_Recursion {
	
	public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return reverse;
        
        
    }

}
