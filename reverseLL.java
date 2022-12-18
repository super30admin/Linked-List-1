// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * Using 3 pointer approach, create a prev pointer to keep track of prev element
 * Current pointer is pointin to the head and we need a fast pointer to point to next of current, 
 * because, once we move current.next to prev, we need a refrence for next element to be reversed.
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
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode current = head;
        ListNode fast = current.next;
        ListNode prev = null;

        while (current.next != null) {
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }

        current.next = prev;

        return current;

    }
}