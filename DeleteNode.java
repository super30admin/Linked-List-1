// Time Complexity : O(N)
// Space Complexity : O(1) - As no additional data structure is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        dummy.next = head;
        for(int i = 1; i<= n+1;i++) {
            p2 = p2.next;
        }
        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return dummy.next;
    }
}
// Your code here along with comments explaining your approach