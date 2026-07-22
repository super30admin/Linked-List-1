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
        SC - O(1)

        This solution removes the nth node from the end of the linked list using the two-pointer technique.
        Move the fast pointer n + 1 steps ahead of the slow pointer.
        If fast becomes null after exactly n moves, it means the node to remove is the head, so return head.next.
        Otherwise, move both fast and slow one step at a time until fast reaches the end of the list.
        At this point, slow points to the node immediately before the node that needs to be removed.
        Update the links by setting slow.next = slow.next.next. Then return the modified head.
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode fast = head;
        while (count <= n && fast != null) {
            fast = fast.next;
            count++;
        }

        ListNode slow = head;

        if (fast == null && count == n) {
            slow = slow.next;
            return slow;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}