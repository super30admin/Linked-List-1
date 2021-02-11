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

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :
    Create a gap on n between first & second pointers. Iterate & remove node.

// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=0;i<=n;i++){
            second = second.next;
        }

        while(second!=null){
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
        return dummy.next;
    }
}