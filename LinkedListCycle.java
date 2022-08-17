// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meetingPos = getMeetingPosition(head);
        
        if (meetingPos == null) return null;
        
        // find the start of the cycle
        ListNode start = head;
        
        while(meetingPos != start) {
            meetingPos = meetingPos.next;
            start = start.next;
        }
        
        return start;
    }
    
    private ListNode getMeetingPosition(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast)
                return slow;
        }
        
        return null;
    }
}