/**
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }

        }
        if(!hasCycle) return null;
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }
}