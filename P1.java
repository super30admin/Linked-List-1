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

//time-o(n)
//space-o(1)
//passed inleetcode - yes
class Solution {
    public ListNode reverseList(ListNode head) {
         if (head == null || head.next == null) return head;
            ListNode new_head = reverseList(head.next);//this sets the last node as new_head, which is returned back to the caller, and hence maintained
            head.next.next = head;
            head.next = null;
            return new_head;
    }
}