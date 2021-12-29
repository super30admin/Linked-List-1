// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                break;
            }
        }
        
         if(fast == null || fast.next==null){
            return null;
        }
       
        slow = head;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
