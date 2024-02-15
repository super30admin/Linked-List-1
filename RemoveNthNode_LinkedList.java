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

 //TimeComplexity:O(n)
 //SpaceComplexity : O(1)
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count =0;
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return head.next;
    }
}