/*
Runtime complexity - O(N) where all the elements are traversed only once.
Space complexity - O(N) - for the stack used for the recursion function

*/

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
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    System.out.println("*****head1 :"+head.val);
    ListNode p = reverseList(head.next);  
    head.next.next = head;
    head.next = null;
    return p;
}
}
