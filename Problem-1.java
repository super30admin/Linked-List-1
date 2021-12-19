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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        return helper(head);
    }
    private ListNode helper(ListNode node) {
        if(node.next == null) {
            return node;
        }
        ListNode temp = helper(node.next);
        node.next.next = node;
        node.next = null;
        return temp;
    }
}