// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // check for empty linked list
        if(head == null) return null;
        // initalize isLoop flag
        boolean isLoop = false;
        // initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // iterate thorught the linked list
        while(fast != null && fast.next != null){
            // move slow pointer by 1x
            slow = slow.next;
            // move fast pointer by 2x
            fast = fast.next.next;
            // set isLoop flag true when slow and fast pointers meet
            if(slow == fast){
                isLoop = true;
                break;
            }
        }
        // in case of no loop
        if(!isLoop) return null;
        // move fast to head and iterate until fast and slow meet
        fast = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}