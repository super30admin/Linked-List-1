//Time = O(n^2) Traversing twice through the linked list
//Space = O(1)

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
        // Create a dummy node with a value of 0 and set its next to the head of the linked list.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        int length = 0;
        ListNode current = head;
        // Traverse the linked list to calculate its length.
        while (current != null) {
            length++;
            current = current.next;
        }
        
        // Subtract n from the length to get the index of the node that we want to remove from the end of the list.
        length -= n;
        current = dummy;
        // Traverse the list again until we reach the node just before the one we want to remove.
        while (length > 0) {
            length--;
            current = current.next;
        }
        
        // Set the next pointer of current to skip the node we want to remove.
        current.next = current.next.next;
        // Return the next pointer of the dummy node, which is the head of the modified list.
        return dummy.next;
    }
}
