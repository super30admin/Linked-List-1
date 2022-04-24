/**
Problem: https://leetcode.com/problems/reverse-linked-list/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // Recursive
    // TC: O(m) where m = length of list
    // SC: O(m) for the recursion stack
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) 
            return head;

        ListNode reverse = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }

    // Iterative
    // TC: O(m) where m = length of list
    // SC: O(1)
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null, next = null, cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}