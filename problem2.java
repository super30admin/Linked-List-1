/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

// Time:O(N)
// Space:O(N)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode p1 = dummyHead;
        ListNode p2 = dummyHead;

        while (n > 0) {
            p2 = p2.next;
            n--;
        }

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return dummyHead.next;
    }
}