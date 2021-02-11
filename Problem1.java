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
// Any problem you faced while coding this : N


// Your code here along with comments explaining your approach
    create dummy node, create temp for head next, point head to dummy, move dummy to head, new head is temp & repeat until last node(null).

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = dummy;
            dummy = head;
            head = temp;
        }

        return dummy;
    }
}