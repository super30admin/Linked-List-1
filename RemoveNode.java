// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
//Use a slow pointer and fast pointer. Move fast pointer until the count reaches n
//and then move both the pointers to identify the node to be removed.
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
        if (head == null || head.next == null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;

        return dummy.next;

    }
}