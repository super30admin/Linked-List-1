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
class problem-1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // temporarily store next node
            current.next = prev;              // reverse the current node's pointer
            prev = current;                   // move prev and current one step forward
            current = nextNode;
        }

        return prev;  // prev becomes the new head
    }
}
