//Time Complexity: O(n)
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem3 {

    public ListNode detectCycle(ListNode head) {
        
        boolean cycle = false;
        if(head == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        
        if(!cycle)
            return null;
        
        slow = head;
        
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
