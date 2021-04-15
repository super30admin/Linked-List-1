// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here  with comments explaining your approach

public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        // Find the point where a cycle exists
        ListNode meeting = helper(head);
        // if no cycle return null
        if (meeting == null)
            return null;

        // one pointer in the beginning and one in the cycle
        ListNode p1 = head;
        ListNode p2 = meeting;
        // loop untill both meet
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;

    }

    // Method to find the point at which they meet
    private ListNode helper(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return slow;

        }
        return null;
    }
}