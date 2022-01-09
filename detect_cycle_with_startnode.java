// Time Complexity : O(n)
// Space Complexity : O(1)

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
        
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            // detects that there is a cycle
            if (slow == fast) {
                break;
            }
        }
        
        // If no cycle 
        if (fast == null || fast.next == null){
            return null;
        }
        
        // Iterate from the start 
        slow = head;
        
        // Iterate till they meet
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}