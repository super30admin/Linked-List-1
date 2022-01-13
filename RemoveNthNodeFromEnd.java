// Time Complexity : O(n) where n is the number of nodes in the list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // dummy node for the case of single node list
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;
        int count = 0;
        // move the fast till it is n distance away
        while (count < n) {
            fast = fast.next;
            count++;
        }
        // move both the pointers simultaneously till fast reaches end of the list and
        // slow reaches the previous node to the node to be removed
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}