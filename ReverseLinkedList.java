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
    /*
        TC - O(n)
        SC - O(n) - recursive stack

        Solution is to reverse a singly linked list using recursion. Recursively traverse to the last node of the list.
        When the last node is reached, store it as the new head (newHead).
        As the recursion returns: We reverse the link by making head.next.next = head.
        Set head.next = null to break the original forward link and avoid creating a cycle.
        Return newHead, which points to the reversed list.
    */
    ListNode newHead;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return newHead;
    }

    private void helper(ListNode head) {
        if (head == null || head.next == null) {
            newHead = head;
            return;
        }

        helper(head.next);
        head.next.next = head;
        head.next = null;
    }
}