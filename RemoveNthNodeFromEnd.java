// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * We use two pointer approach in this problem. The fast pointer will initially move n steps to maintain the gap.
 * we then move both the pointers till fast reaches the last element
 * At this point, the first or the slow pointer is pointing to the previous node of the node to be removed. 
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        for (int i=0;i<n;i++) {
            fast = fast.next;
        }
        
        // check case when fast reaches the end
        // In this case n == length of list
        // we have to remove the first element
        
        if(fast == null) {
            head = head.next;
            return head;
        }
        
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}