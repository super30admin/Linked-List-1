// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
        
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }

            return fast; 
            }     
        }
        return null;               
    }
}