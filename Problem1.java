/**Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

// Time Complexity : O(n) 
// Space Complexity : O(1) constant time and  O(n) if we are using recursion(or recursive stack)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach- we consider a list with prev, curr and next. we change/reverse our references or links.
//here the edge case would be if head or head.next == null, then return head
//this can be handled by both recursive and iterative solution
//logic for reversing: prev-null, curr-head, next-head.next.Until next is not null, keep iterating
//below is recursive solution:.

class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head == null || head.next == null) return head;
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return r;
    }
}