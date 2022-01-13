// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // check for empty linked list
        if(head == null) return null;
        
        // initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        
        // initalize isLoop flag
        boolean hasCycle = false;
        
        // iterate through the linked list
        while(fast != null && fast.next != null){
            // move slow pointer by 1x
            slow = slow.next;
            
            // move fast pointer by 2x
            fast = fast.next.next;
            
            // set hasLoop flag to true when slow and fast pointers meet
            if(fast == slow){
                hasCycle = true;
                break;
            }
        }
        
        // in case cycle is not present
        if(!hasCycle) return null;
        
        // move slow(or fast) to head and iterate until fast and slow meet
        slow = head;
        
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}