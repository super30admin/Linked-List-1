// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }

        ListNode dummy = new ListNode(-1); // having a dummy node.
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        while (count <= n) {
            count++;
            fast = fast.next; // craeting a gap of n between slow and fast pointers.
        }

        while (fast != null) {
            slow = slow.next; // slow is at the node previous to the node to be deleted.
            fast = fast.next;
        }

        slow.next = slow.next.next; // deleteing the node by adjusting the links.

        return dummy.next; // returning head.

    }
}