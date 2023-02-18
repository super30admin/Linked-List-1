// Time Complexity : O(n) where n is number of nodes in LinkedList
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use 2 pointers fast and slo. We also take a dummy head for cases where we have count = n. We then move fast by 
   n places. So distance between fast and slo is n. Now we move fast and slo till fast.next != null. When fast reaches end
   slo is at nth position from end and we remove the node and return the head.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slo = dummy;
        ListNode fast = dummy;

        int i = 0;
        while(i < n) {
            fast = fast.next;
            ++i;
        }

        while(fast.next != null) {
            fast = fast.next;
            slo = slo.next;
        }

        slo.next = slo.next.next;

        return dummy.next;
    }
}