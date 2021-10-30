// Linked List cycle 2
// TIme O(n)
// Space O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Boolean cycle = false;
        
        while(fast!=null && fast.next!=null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast){
                // cycle = true;
                break;
            }
            
        }
        
        if(fast == null || fast.next == null){
            return null;
        }
        
        slow = head;
        
        while(slow != fast){
            
            slow = slow.next;
            fast = fast.next;
        }
        
        // if(cycle == false){
        //     return null;
        // }
        
        return fast;
    }
}