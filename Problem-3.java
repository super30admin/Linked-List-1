// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Solution: Have slow and fast fointer where fast moves with double speed.
// If fasts meets slow, there is a cycle. If there is no cycle fast or fast.next will become null
// To return the node where cycle is found: reset fast pointer to head and move slow and fast pointer
// with normal pace. Slow will give us the head in end. This happens because head pointer and
// slow pointer are equidistant from node where cycle is found.
// slow distance = a+b, fast distance = a+2b+c so a = c
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
    
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast=fast.next;
        }
        return slow;

    }
}