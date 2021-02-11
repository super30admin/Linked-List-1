// Time complexity - O(n)
// Space complexity - O(constant)
// Works on leetcode

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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            // Cycle has been detected - at half the loop
            if(slow == fast){
                // Cycle has been detected;
                ListNode dummy = head;
                while(dummy!=slow){
                    dummy = dummy.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
