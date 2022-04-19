// Time complexity: O(n) where n is the number of nodes in the linked list.
// Space complexity: O(1).
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
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        // while(fast.next != null && fast.next.next != null) // Works when node is present for sure.
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {      // If cycle is present, slow and fast pointers meet.
                cycle = true;
                break;
            }
        }
        if(cycle == false) return null;
        slow = head;            // Set either fast or slow to head.
        while(slow != fast) {       // The node they meet is the start of the cycle. Same distance for slow and fast.
            slow = slow.next;
            fast= fast.next;
        }
        return slow;
    }
}