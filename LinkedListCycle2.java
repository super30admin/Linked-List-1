// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/**
 * Approach: 
 * This problem is about detecting a cycle in a linked list and finding the node where the cycle begins.
 * I used the slow and fast pointer technique where the slow pointer moves one step at a time and the fast pointer moves two steps at a time. 
 * If a cycle exists, the slow and fast pointers will meet, and then we reset the slow pointer to the head and move both pointers one step at 
 * a time to find the starting node of the cycle. f no cycle is detected, the fast pointer will eventually reach the end of the list, and we return null. 
 */ 
 public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Initialize slow pointer at the head of the list
        ListNode slow = head;
        // Initialize fast pointer at the head of the list
        ListNode fast = head;

         // Traverse the list with slow moving one step at a time and fast moving two steps at a time
        while(fast != null && fast.next != null) {
            // Move slow pointer by one step
            slow = slow.next;
            // Move fast pointer by two steps
            fast = fast.next.next;
            // If slow and fast pointers meet, it indicates a cycle is present
            if(slow == fast) {
                slow = head;
                // Move both slow and fast pointers one step at a time to know from where cycle is start
                while(slow != fast) {
                    // Move slow pointer one step
                    slow = slow.next;
                    // Move fast pointer one step
                    fast = fast.next;
                } 
                // Return the node where the cycle begins
                return slow;
            }
        }
        return null;
    }
}
 


   

     