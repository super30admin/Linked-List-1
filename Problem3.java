// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes, 0ms
// Any problem you faced while coding this : No, I had understood the approach before, but tried it now


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slowPtr = hasCycle(head);
        ListNode fastPtr = head;
        
        if(slowPtr != null){
            
            while(fastPtr != slowPtr){
                
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
                
            }
            
            return slowPtr;  
        }
 
        return null;
 
    }
    
    public ListNode hasCycle(ListNode head){
        
        ListNode current = head;
        
        ListNode slow = head;
        
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return slow;
            }
            
        }
        
       return null;
    }
}