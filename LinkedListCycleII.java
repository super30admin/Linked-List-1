//Time Complexity: O(N)
//Space Complexity: O(1)
// Does this work in Leetcode: Yes. 

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
        
        
        // Base Case
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        
        // Finding the Cycle 
        while (fast!= null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                
                // Finding the exact node/entrace for the cycle
                ListNode p1 = head;
                while(p1 != slow) {
                    p1 = p1.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
