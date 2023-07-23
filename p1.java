// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


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
        //base condition
        if(head == null || head.next == null) return head;

//Return head of the reversed linked list
        ListNode result = reverseList(head.next);
//Pointing head.next.next to head which reverses the flow of the linked list
        head.next.next = head;
        //Removing the current flow
        head.next = null;

        return result;
    }
}