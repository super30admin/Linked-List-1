// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
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

        if(head == null) return null;
        if (head.next == null) return null;

        ListNode slow = head; // goes normally
        ListNode fast = head; // goes two times faster
        boolean isCyclic = false;

        while (fast !=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCyclic = true;
                break;
            }
        }

        if (!isCyclic) return null;

        if (isCyclic) fast = head;

        while (isCyclic  && slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;

    }
}