// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach1: 2-pass approach
// Calculate the total number of nodes : len
// Find the position of the node to be deleted: len-n
// Traverse till len-n-1 and set the pointer to the next node of the one to be deleted.

// Approach2: One-pass approach
// Consider a dummy node and a count which can go upto n
// Consider two pointers fast and slow. Until count reaches n, move fast by one.
// Once count > n, move both slow and fast by one step as a set until fast reaches null.
// Now set the slow pointer to the next node of the one to be deleted.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // edge case
        if(head == null) return null;
        // Approach1: 2-pass approach
        /* ListNode temp = head;
        int len = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }
        if(n == len) return head.next;
        int count = 0;
        temp = head;
        while(temp != null && count++ != len-n-1) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;*/
        
        // Approach2 : One-pass approach
        ListNode dummy = new ListNode(0);
        ListNode fast = dummy, slow = dummy;
        dummy.next = head;
        int count = 0;
        while(count++ <= n) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}

