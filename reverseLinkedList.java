/** Time Complexity: O(n) where n the length of the linked list
 * Space Complexity: O(1)
 * Executed on leetcode: yes
 * approach: Traverse the list.
 * change the current node's next pointer to point to its previous element. 
 * Since a node does not have reference to its previous node, you must store its previous element beforehand. 
 * You also need another pointer to store the next node before changing the reference.
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
class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}