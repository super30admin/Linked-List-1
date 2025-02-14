// Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, recusion is used for every head.next. While we reach the end of the list with condition either head or head.next is null we add thet
 * node to result. And for all the remaining node, point head.next.next to head which gives backward direction and head.next to null saying 
 * there is no link in forward direction. Finally return result gives the reversed linked list.
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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;

    }
   
}