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
 * Space Complexity: O(N)
 * LeetCode: Y (https://leetcode.com/problems/reverse-linked-list/)
 * Approach:
    Assume that you already have the head of remaining reversed linked list. So store that head to return later
    so the current node will be the head of that reversed linked list
    so attached that current node to the end of reversed linked list
    make that the tail node
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // base condition and valid input consition
        if(head == null || head.next == null) {
            return head;
        }
        
        // get the head of remaining Linked List
        ListNode headOfRemainingListReversed = reverseList(head.next);
        // make the current node the tail by attaching current to the end of reversed linked list
        head.next.next = head;
        // terminate the linked list by setting tail's next to null
        head.next = null;
        
    
        return headOfRemainingListReversed;
    }
}
