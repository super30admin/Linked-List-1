// Time Complexity : O(n)
// Space Complexity : O(1)
public class ReverseList {
    public ListNode reverseList(ListNode head) { 
        ListNode prev = null;
        if(head == null) return null;
        ListNode fast = head.next;
        while(fast!=null){
            head.next = prev;
            prev = head;    
            head = fast;
            fast = fast.next;
            
        }
        head.next = prev;
        return head;
    }
}
