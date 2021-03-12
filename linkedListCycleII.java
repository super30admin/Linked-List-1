// Time Complexity : O(n) since it traverses only x+y+z times in the linkedlist
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            //compare slow == fast since that implies start of the cycle
            if(slow == fast){
                //cycle
                ListNode dummy = head;
                //increment dummy and slow once sinze x=z in our proof until they meet and return one of them
                while(dummy != slow){
                    slow=slow.next;
                    dummy=dummy.next;
                }
                
                return dummy;
            }
        }
        
        return null;
    }
}