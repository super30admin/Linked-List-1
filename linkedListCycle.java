// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean containsCycle = false;
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                containsCycle = true;
                break;
            }
        }
        if (containsCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
    }
}