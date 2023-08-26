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
// Time Complexity: O(n)
// Space Complexity: O(1)
// Runs on Leetcode:  yes
class Solution {
    public ListNode reverseList(ListNode node) {
        ListNode before = null;
        ListNode current = node;
        while (current != null) {
            ListNode upcoming = current.next;
            current.next = before;
            before = current;
            current = upcoming;
        }
        return before;
    }
}
