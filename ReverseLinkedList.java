// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Example 2:
// Input: head = [1,2]
// Output: [2,1]

// Example 3:
// Input: head = []
// Output: []
 
// Constraints:
// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000

// Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

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

// ITERATIVE APPROACH:
class Solution {
    public ListNode reverseList(ListNode head) {
        // if list is empty, returning null
        if (head == null){
            return head;
        }

        ListNode prev = null; // pointer to previous node (needed to set current pointer)
        ListNode curr = head; // pointer to current node being processed
        ListNode nxt = curr.next; // pointer to next node (needed to not lose track)

        // Traversing through the list until the end
        while (nxt != null){
            curr.next = prev; // reversing the link
            prev = curr; // moving 'prev' one step forward
            curr = nxt; // moving 'curr' one step forward
            nxt = nxt.next; // moving 'nxt' one step forward
        }

        curr.next = prev; // final reversal for the last node

        return curr; // 'curr' is now the new head of the revsersed list
    }
}

// RECURSIVE APPROACH (TC: O(n), SC: O(1)):
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         // Base case: if the list is empty or has only one node, return it
//         if (head == null || head.next == null){
//             return head;
//         }

//         // Recursively reverse the rest of the list
//         ListNode reversed = reverseList(head.next);

//         // Reverse the current node's pointer
//         head.next.next = head;  // Make the next node point back to current node
//         head.next = null;      // Set current node's next to null to avoid cycle

//         // Return the new head of the reversed list
//         return reversed;
//     }
// }
