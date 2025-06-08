// Time Complexity O(n)
// Space Complexity O(h)
// Runs on LeetCode YES
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
class ReverseALinkedList {
    ListNode reversHead;

    public ListNode reverseList(ListNode head) {
        return helper(head);
    }

    private ListNode helper(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            reversHead = head.next;
        }
        helper(head.next);
        head.next.next = head;
        head.next = null;

        return reversHead;
    }
}