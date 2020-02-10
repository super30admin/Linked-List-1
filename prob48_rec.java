// S30 Big N Problem #48 {Easy}
// 206. Reverse Linked List
// Time Complexity :O(n)
// Space Complexity :O(n) {recursive stack}
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
// Recursive Solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head==null || head.next==null) return head;
        
        //logic
        LisNode reverse=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reverse;
    }
}