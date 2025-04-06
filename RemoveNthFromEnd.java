//Time Complexity : O(n)
//Space Complexity : O(1)

//Leeetcode : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Removes the nth node from the end of the linked list and returns its head.
 * Uses two-pointer technique with a dummy node to simplify edge cases.
 * Time complexity is O(n) and space complexity is O(1).
 */

public ListNode removeNthFromEnd(ListNode head, int n) {

public class RemoveNthFromEnd {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while (count <= n) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}