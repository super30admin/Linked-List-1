// Time Complexity : O(n)
// Space Complexity : O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // detect cycle first
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        // no cycle, so no loop, return
        if(slow != fast) {
            return null;
        }

        // otherwise, cycle is there, detect starting position
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}