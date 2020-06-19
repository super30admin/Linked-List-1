// Time Complexity :O(n) n is the number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        boolean target = false;
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow==fast) {
                target = true; 
                break;
            }
        }
        
        if(!target) return null;
        else{
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return fast;
        
    }
}