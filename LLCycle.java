// Time Complexity : O(n), n = number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;

        ListNode slow = head, fast = head;
        boolean cycle = false;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle) {
            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}