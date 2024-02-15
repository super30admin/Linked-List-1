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

 //TimeComplexity : O(n)
 //SpaceComplexity : O(1)
 class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = prev.next;
        ListNode extraPointer = prev.next.next;
        while( current.next != null) {
            current.next = prev;
            prev = current;
            current = extraPointer;
            extraPointer = extraPointer.next;
        }
        current.next = prev;
        head.next = null;
        return current;
    }
}