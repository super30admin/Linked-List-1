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

 /* Time Complexity : O(n)
 * 	n - lenghth of the linked list */
/* Space Complexity : O(h) 
 * 	h - size of the recurse stack */
 // Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//recursive solution

class Solution {
    public ListNode reverseList(ListNode head) {
        //base condition
        if(head == null || head.next == null) return head;
        //recursion - will be executed only till the 2nd last node due to the base case
        ListNode result = reverseList(head.next);
        // for the last node
        head.next.next = head;
        head.next = null;
        return result;
    }
}