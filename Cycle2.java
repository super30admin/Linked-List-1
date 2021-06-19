// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * In this problem, we implemented the slow and fast pointers to find if a cycle exist based on Floyd's cycle detection algorithm.
 * After we find a intersection, we set either of the pointers to the head of the list and traverse both slow and fast pointers till we reach at a common node
 * That node is essentially the start of the cycle.
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(fast == null || fast.next == null) {
            return null;
        }
        
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while(fast != null && fast.next != null && slow != fast);
        
        slow = head;
        
        if (fast == null || fast.next == null){
            return null;
        }
        
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}