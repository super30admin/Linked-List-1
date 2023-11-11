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

 /*
    - placing two pointers slow and fast
    - while count is not equal to n, keep incrementing fast
    - move the fast to the last node, and increment both the pointers
    - once the last node is encountered, then remove the node slow.next
    - done in one pass with no extra space
    - TC: O(n)
    - SC: O(1)
    - works on leetcode
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }

        while(fast!=null)
        {
            fast =fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}