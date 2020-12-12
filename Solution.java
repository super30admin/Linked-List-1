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

/**
 * Time Complexity: O(N) where N is the number of nodes in the givev Linked List
 * Space Complexity: O(1)
 * LeetCode: Y (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 * Approach:
 *          Use two pointers
 *          Move pointer1 (n + 1) nodes ahead of pointer2
 *          Move pointer1, pointer2 one node at a time until pointer2 reaches the end of Linked List
 *          Then, remove the next node of pointer2
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Initialize a dummy node
        ListNode dummy = new ListNode(-1, head);
        // Attach dummy node to the Linked List
        dummy.next = head;
        
        // Point pointer1, pointer2 to the dummy node
        ListNode pointer1 = dummy, pointer2 = dummy;
        
        // Move pointer1 (n + 1) nodes ahead
        for(int i = 0 ; i <= n ; i++) {
            pointer1 = pointer1.next;
        }
        
        // Loop until pointer2 reaches the end of Linked List 
        // This loop will not be executed if n equals the length of the Linked List i.e. delete the first node of the Linked List
        while(pointer1 != null) {
            // Move pointer1 ahead by one node
            pointer1 = pointer1.next;
            // Move pointer2 ahead by one node
            pointer2 = pointer2.next;
        }
        
        // Delete the node next to pointer1
        pointer2.next = pointer2.next.next;
        
        // return the head of the Linked List
        return dummy.next;
     
    }
}
