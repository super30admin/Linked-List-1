// Time Complexity : o(N)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


public class Solution {
    // Function to detect the start of a cycle in a linked list
    public ListNode detectCycle(ListNode head) {
        // Initialize two pointers, slow and fast
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false; // Flag to indicate if a cycle is detected
        
        // Traverse the list to detect a cycle using Floyd's Tortoise and Hare algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by one step
            fast = fast.next.next;   // Move fast pointer by two steps
            if (slow == fast) {      // If they meet, a cycle is detected
                flag = true;
                break;
            }
        }
        
        // If no cycle is detected, return null
        if (!flag) return null;
        
        // Reset fast pointer to the head and move both pointers until they meet again
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Return the node where the cycle begins
        return slow;
    }
}
