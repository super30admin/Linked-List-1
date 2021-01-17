// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no  
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        int count = 0;
        while(count <= n)
        {
            p2 = p2.next;
            count++;
        }
        while(p2 != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return dummy.next;
    }
}