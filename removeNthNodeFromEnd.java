// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * we create a dummy node to cover the edge case of n begin the 1st node to be removed
 * 1st move the fast pointer n steps ahead
 * Then move slow adn fast pointer by 1 till fast reaches last node and slow reaches 1 node before the node to removed 
 * remove the nth node from end and return the head.
 */

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
        if (head == null)
            return head;
        // first move the fast pointer n steps ahead.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        // move both pointer by 1 till fast reaches last node and slow reaches 1 node
        // before the node to removed
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}