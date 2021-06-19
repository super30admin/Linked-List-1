// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * Go as deep in the recursion as we can till the last element
 * For last element the node will be returned simply and set as the new head.
 * For all other elements, we can reverse the link
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        // base case
        
        if(head == null) return null;
        
        if(head.next == null) {
            return head;
        }
        
        // Logic
        // Go as deep in the recursion as we can till the last element
        // For last element the node will be returned simply and set as the new head.
        // for all other elements, we can reverse the link
        
        ListNode rev_head = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return rev_head;
    }
}