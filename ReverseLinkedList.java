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
        // Check if the head of the linked list is null
        if(head == null)
            return null;

        ListNode prev = null; // Initialize a pointer to the previous node
        ListNode curr = head; // Initialize a pointer to the current node
        ListNode fast = head.next; // Initialize a pointer to the next node

        while(fast != null) {
            curr.next = prev; // Reverse the next pointer of the current node to point to the previous node
            prev = curr; // Update the previous node to the current node
            curr = fast; // Update the current node to the next node
            fast = fast.next; // Move the next pointer forward
        }

        curr.next = prev; // Reverse the next pointer of the last node

        // Return the new head of the reversed linked list
        return curr;
    }
}

//Time Complexity: O(N), where N is the number of nodes in the linked list.
//Space Complexity: O(1), since we are using a constant amount of extra space regardless of the input size.
