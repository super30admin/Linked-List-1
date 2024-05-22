// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        // here we will be using slow and fast pointer
        // check if fast and slow pointers meet after certain iterations
        // if they do then reset any one pointer and start from begining and iterate at the same speed.
        // the node at which they meet again that node will be the starting of cycle.

        if(head == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean cycleDetected = false;

        while(fast != null && fast.next != null) {
            slow = slow.next; // 1 step at a time
            fast = fast.next.next; // 2 steps at a time
            if(fast == slow){
                cycleDetected = true;
                break;
            }
        }
        if(!cycleDetected) return null; // cycle not detected

        // cycle is detected, time to reset any one of the pointers
        fast = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}