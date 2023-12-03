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

// Time Complexity : O(2n) -> O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Use fast-slow pointer approach to find the cycle. If cycle is not found return null. If cycle is found, then to find the head of cycle : The thumb rule is head of the cycle and
 * head of the LinkedList will always be equidistant from the intersection point of the fast & slow pointers.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast != null && fast.next != null) { //O(n)
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                flag = true;
                break;
            }
        }

        if(!flag) return null;

        slow = head;

        while(slow != fast) { //O(n)
            slow = slow.next;
            fast = fast.next;
        }

        return slow;


    }
}