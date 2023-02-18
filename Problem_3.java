// Time Complexity : O(n) where n is number of nodes in LinkedList
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use 2 pointers fast and slo where slo moves by 1 place and fast by 2 places. If they dont meet we just return null.
   Else we again initialize slo to head. Now we move slo and fast by 1 place each. In the end the place where the 2 pointers 
   match is the point where the cycle starts.
*/

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
        if(head == null)
            return null;

        ListNode slo = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast != null && fast.next != null) {
            slo = slo.next;
            fast = fast.next.next;

            if(fast == slo) {
                flag = true;
                break;
            }
        }

        if(!flag)
            return null;
        
        fast = head;

        while(slo != fast) {
            slo = slo.next;
            fast = fast.next;
        }
        return slo;
    }
}