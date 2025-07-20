// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Example 1:
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

// Example 2:
// Input: head = [1], n = 1
// Output: []

// Example 3:
// Input: head = [1,2], n = 1
// Output: [1]
 
// Constraints:
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
 
// Follow up: Could you do this in one pass?

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
        // if list is empty, return null
        if (head == null){
            return head;
        }

        // Creating a dummy node to simplify edge cases (such as removing the first node)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // Initializng two pointers, both starting from dummy
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;

        // moving the fast pointer 'n + 1' steps ahead to maintain a gap of n between slow and fast
        while (count <= n){
            fast = fast.next;
            count++;
        }

        // moving both pointers until fast reaches the end of list
        // After the loop, slow will be right before the node to be deleted
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        // Removing the target node
        slow.next = slow.next.next;

        // Returning the head of the modified list
        return dummy.next;
    }
}