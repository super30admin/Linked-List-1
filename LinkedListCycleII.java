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
        
        if(head == null)    return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode intersect = getIntersection(slow,fast);
        
        if(intersect == null)   return null;
        
        while(intersect != slow){
            intersect = intersect.next;
            slow = slow.next;
        }
        
        return slow;
    }
    private ListNode getIntersection(ListNode slow, ListNode fast){
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)    return slow;
        }
        return null;
    }
}
