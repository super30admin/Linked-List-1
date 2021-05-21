// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


//Time Complexity: O(n) since we are iterating once for finding the cycle and the other O(n) for finding the node where cycle happens
//Space Complexity: O(1) since we are not taking any extra space except result array
public class Solution {
    public ListNode detectCycle(ListNode head) {
     
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycled = false;
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                isCycled = true;
                break;
            }            
        }
        if(!isCycled) return null;
        fast = head;
        
        while(slow != fast)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
}