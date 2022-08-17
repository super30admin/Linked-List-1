// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * Recursion based solution
 */

class Solution {
    
    ListNode reversed = null;
    
    public ListNode reverseList(ListNode head) {
        
        helper(head, null);
        
        return reversed;
    }
    
    private void helper(ListNode head, ListNode prev) {
        if (head == null) {
            reversed = prev;
            return;
        }
        
        helper(head.next, head);
        
        head.next = prev;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * Iterative solution
 */

class Solution {
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}