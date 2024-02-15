// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Maintained a distance of n between slow and fast pointer;
// When fast becomes null; slow is at the node which needs to be removed;
// using a prev pointer can be used to remove slow

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // the pointer before the node to be removed
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        int counter = 0;

        // creating a gap of n between slow and fast
        while (counter < n) {
            fast = fast.next;
            counter++;
        }

        while (fast != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        // now, slow is at the node which needs to be removed
        if (slow == head) {
            ListNode res = slow.next;
            slow.next = null;
            return res;
        }

        // case: slow is not at head;
        ListNode temp = slow.next;
        slow.next = null;
        prev.next = temp;

        return head;
    }
}