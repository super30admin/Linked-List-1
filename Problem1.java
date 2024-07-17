//Time = O(n)
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
public class Solution {
    public ListNode reverseList(ListNode head) {
        // If the list is empty or has only one node, it is already reversed
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize the pointers to the current node (curr) and the previous node (prev)
        ListNode prev = null;
        ListNode curr = head;
        
        // Traverse the list, reversing the direction of each node
        while (curr != null) {
            // Store the next node in a separate variable, so we don't lose access to it
            ListNode next = curr.next;
            // Reverse the direction of the current node, pointing it to the previous node
            curr.next = prev;
            // Move the previous node pointer to the current node
            prev = curr;
            // Move the current node pointer to the next node
            curr = next;
        }
        
        // At this point, prev points to the head of the reversed linked list
        return prev;
    }
}
