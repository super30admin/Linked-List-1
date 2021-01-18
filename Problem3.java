// https://leetcode.com/problems/linked-list-cycle-ii/
// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow)
                break;
        }
        
        if(fast == null || fast.next == null)
            return null;
        
        fast = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}