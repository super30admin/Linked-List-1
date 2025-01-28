// TC = O(N)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


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
        // TC = O(N), SC = O(1)
        // null
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        // detecting cycle
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if(hasCycle == false) return null; // no cycle found
// to find the beginning of the cycle -> 2(a + b) = a + b + c + b  => a = c, now move both at same speed
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // or return fast, as both point to the same node
    }
}