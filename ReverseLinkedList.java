// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Maintain 2 pointers previous and current to iteratively connect in a way where current points to previous.
Make sure to store current's next element in a temporary node before this connection is made. Later, swap
the previous, current and temp nodes to continue the reversing process.
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
        //Iteratively
         ListNode prev = null;
         ListNode curr = head;

         while(curr != null) {
             ListNode temp = curr.next;
             curr.next = prev;
             prev = curr;
             curr = temp;
         }
         return prev;
    }
}