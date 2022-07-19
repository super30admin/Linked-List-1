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

// TC: O(N)
// SC: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        if(!hasCycle) return null;
        
        slow = head;
        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
