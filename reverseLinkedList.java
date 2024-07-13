// Time Complexity : o(N)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
    public ListNode reverseList(ListNode head) {
        // If the list is empty or has only one node, return the head as it is
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;     // Initialize prev to null, it will eventually become the new head of the reversed list
        ListNode current = head;  // Start with the current node as the head of the list
        ListNode front = head.next;  // Front node will be the node after current, to keep track of the rest of the list
        
        // Iterate through the list until the front node is null
        while(front != null) {
            current.next = prev;  // Reverse the current node's pointer to point to the previous node
            prev = current;       // Move prev to the current node
            current = front;      // Move current to the front node
            front = front.next;   // Move front to the next node in the original list
        }
        
        // At the end, current will be the last node, reverse its pointer to prev
        current.next = prev;
        
        // Return current which is now the new head of the reversed list
        return current;
    }
}


//recursive

class Solution {
    // Helper function to reverse the linked list recursively
    private ListNode helper(ListNode head) {
        // Base case: if current node or next node is null, return head
        if (head == null || head.next == null) {
            return head;
        }
        
        // Recursively reverse the rest of the linked list
        ListNode lastHead = helper(head.next);
        
        // Reverse the link between current node (head) and next node
        head.next.next = head;
        head.next = null; // Set current node's next to null to break the original link
        
        return lastHead; // Return the new head of the reversed linked list
    }
    
    // Method to initiate the reversal of the linked list
    public ListNode reverseList(ListNode head) {
        return helper(head); // Call helper function to start reversal
    }
}
