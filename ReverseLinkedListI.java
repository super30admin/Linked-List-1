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
 * Time Complexity: O(N) where N is the length of the Linked List
 * Space Complexity: O(1)
 * LeetCode: Y (https://leetcode.com/problems/reverse-linked-list/)
 * Approach:
    Reverse links one by one from the beginning
    Start: prev set to null, and current set to head
    Do the below for each node in the Linked List
        Store next of current into a temp node
        Set current next to prev
        Update prev to current
        Update currrent to temp node
    return prev
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // Start: prev set to null, and current set to head
        ListNode prev = null, current = head;
        
        // Do the below for each node in the Linked List
        while(current != null) {
            // Store next of current into a temp node
            ListNode temp = current.next;
            // Set current next to prev
            current.next = prev;
            // Update prev to current
            prev = current;
            // Uodate current to temp node
            current = temp;
        }
        
        // return prev
        return prev;
    }
}
