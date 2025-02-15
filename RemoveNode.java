// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Moving the fast pointer n steps ahead, then move both slow and fast pointers together
// until fast reaches the end of the list. The slow pointer will be at the node just before the
// node to be removed.

// Your code here along with comments explaining your approach

public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return dummy.next;

    }
}
