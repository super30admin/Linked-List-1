// Time Complexity : O(n)
// Space Complexity :  O(1) for iterative approach. In the recursive approach, recursive stack uses O(n) space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach1: Iterative approach
// This approach requires 3 extra pointers to manage the reversal.

// Approach2: Recursive approach
// On recursing on head.next, we can reach the final node. Once final node is reached, the reversal process is done and recursion backtracks.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        // Approach1: Iterative approach
        /*
        ListNode prev = null, curr = head, temp = head;
        while(curr != null) {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
        */
        
        // Approach2: Recursive approach
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}

