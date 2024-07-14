
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * TC --> O(n)
 * SC --> O(1)
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        if (curr == null) {
            return null;
        }
        ListNode nextNode = head.next;
        while (nextNode != null) {
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            nextNode = nextNode.next;
        }
        curr.next = prev;
        prev = curr;

        return prev;
    }
}
