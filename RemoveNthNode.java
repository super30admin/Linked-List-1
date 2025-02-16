// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

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

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;
        
        // Advances first pointer so that the gap between first and second is n nodes apart
        for(int i = 0; i <= n; i++) {
            first = first.next;
        }

        //Now move the second pointer and stand 1 node before n
        while(first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        
        return dummy.next;
    }
}