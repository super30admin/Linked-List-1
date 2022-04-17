/**
Problem: https://leetcode.com/problems/reverse-linked-list/
TC: O(m) where m = length of list
SC: O(1)
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
    ListNode start = null;
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) 
            return head;
        
        reverse(head);
        return start;
    }
    
    private ListNode reverse(ListNode cur) {
        if (cur.next == null) {
            start = cur;
            return cur;
        }
        ListNode next = reverse(cur.next);
        next.next = cur;
        cur.next = null;
        return cur;
    }

    // Iterative
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