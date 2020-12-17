// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

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
        
        if(head == null) {
            return head;
        }
        
        ListNode slow = head, fast = head;
        boolean hasCycle = false;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        if(hasCycle == false) {
            return null;
        }
        
        slow = head;
        
        while(slow != fast) {
            
            slow = slow.next;
            fast = fast.next;
            
        }
        
        return slow;
        
    }
}