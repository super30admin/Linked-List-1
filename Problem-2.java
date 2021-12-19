// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
        ListNode curr = head;
        for(int i=1;i<n;i++) {
            curr = curr.next;
        }
        ListNode prev = null;
        while(curr.next!=null) {
            curr = curr.next;
            if(prev ==null) {
                prev = head;
                continue;
            }
            prev = prev.next;
        }
        if(prev == null) {
            return head.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}