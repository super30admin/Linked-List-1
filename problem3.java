package Linked-List-1;

public class problem3 {
// Time Complexity : O(n) n -> number of nodes.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public ListNode detectCycle(ListNode head) {
         
    ListNode slow = head;
    ListNode fast = head;
    boolean isCycle = false;
    
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        
        if(slow == fast){
            isCycle = true;
            break;
        }
    }
    
    if(!isCycle) return null;
    
    fast = head;
    
    while(fast != slow){
        slow = slow.next;
        fast = fast.next;
    }
    
    return fast;
}
}
