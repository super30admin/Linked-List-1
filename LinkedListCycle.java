// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                break;
            }
        }

        if(fast == null || fast.next == null) return null;
        
        slow = head;
        
        while(fast != slow) {

            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}