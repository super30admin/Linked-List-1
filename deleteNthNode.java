// Time Complexity : o(N)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node that points to the head of the list
        // This helps to handle edge cases like removing the head node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode slow = dummy;  // Initialize slow pointer to dummy node
        ListNode fast = dummy;  // Initialize fast pointer to dummy node
        
        // Move fast pointer n+1 steps ahead to maintain the gap of n nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both slow and fast pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Slow is now at the node just before the one to be removed
        ListNode temp = slow.next;  // Store the node to be removed in temp
        
        // Remove the nth node from the end by linking slow.next to slow.next.next
        slow.next = slow.next.next;
        
        // Nullify the next pointer of the removed node to help with garbage collection
        temp.next = null;
        
        // Return the head of the modified list
        return dummy.next;
    }
}
