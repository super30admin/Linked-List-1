// Reverse Linked List
// Time Complexity : 0(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Approach
// consider 3 pointers (previous, current & fast) and assign them
// then move all accordingly

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
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;

        while(fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;   //curr = curr.next is wroong because connection is already changed
            fast = fast.next;
        }
        curr.next = prev; //for the last node
        return curr;
    }
}