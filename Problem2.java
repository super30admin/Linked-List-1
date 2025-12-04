// Time Complexity : O(N) where N is the total number of ListNodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I use the classic two-pointer technique to find the node that is just before the one that needs to be removed.
First, I move the fast pointer n + 1 steps ahead to create a fixed gap between slow and fast.
Then I move both pointers together until fast reaches the end, ensuring slow lands exactly at the correct spot to remove the nth node from the end.
 */

public class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count <= n) {
            count++;
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
