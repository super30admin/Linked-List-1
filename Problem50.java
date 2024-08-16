// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
        // Create a dummy node to simplify edge cases like removing the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize two pointers starting from the dummy node
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move the first pointer n+1 steps ahead to maintain the gap
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Adjust the pointers to skip the nth node from the end
        second.next = second.next.next;
        
        // Return the head of the modified list
        return dummy.next;
    }
}
