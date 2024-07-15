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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reversed;
        // base
        if(head == null || head.next == null) return head;

        // logic
        reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}