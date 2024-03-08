//time O(N) N is the no of nodes
//space O(1)
//approach Using 3 pointers

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
        if(head  == null || head.next == null) return head;
        if(head.next.next == null) {
            ListNode head1 = head.next;
            head1.next = head;
            head.next = null;
            return head1;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = curr.next;
        while(temp != null) {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;
        return curr;
    }
}
