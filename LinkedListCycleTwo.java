// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head; // starting both the pointers at the same node to avaoid chasing.
        ListNode fast = head;
        boolean IsCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // moving slow by 1
            fast = fast.next.next; // moving fast by 2
            if (slow == fast) { // if slow and fast meet there is a cycle.
                IsCycle = true;
                break;
            }
        }

        if (IsCycle == false) {
            return null;
        }

        slow = head; // resetting the slow pointer so that slow and fast meet at the head of the
                     // cycle.
        while (slow != fast) {
            slow = slow.next; // moving both pointers by 1
            fast = fast.next;
        }

        return slow;

    }
}