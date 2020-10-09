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

/**
SC : O(1)
TC : O(n)
**/

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //Blind Line
        if(head == null) return null;
        
        ListNode intersect = getIntersection(head);
        
        if(intersect == null){ //TC in func implementation
            return null;
        }
        
        ListNode pt1 = head;
        ListNode pt2 = intersect;
        
        while(pt1 != pt2) {
            pt1 = pt1.next;
            pt2 = pt2.next;
        }
        
        return pt1;
        
    }
    
    private ListNode getIntersection(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return slow;
        }
        
        return null;
        
    }
    
}