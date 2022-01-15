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
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        int k = n;

        while(k > 0 && fast != null) {
            fast = fast.next;
            k--;
        }

        if(fast == null){
            head = head.next;
        }

        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(null != slow && null != slow.next)
            slow.next = slow.next.next;

        return head;
    }
}