// Time Complexity : O(N)
// Space Complexity : O(1) - no additional data structure is used
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
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode p1 = head;
                while(p1 != slow){
                    p1 = p1.next;
                    slow = slow.next;
                }
                 return slow;
            }
        }
        return null;
    }
}

// Your code here along with comments explaining your approach