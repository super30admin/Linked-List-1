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

// Time Complexity : O(n) => As we iterate over the n nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Used previous, current and fast node. Initially previous = null, current = head, fast = head.next.
Then assign current.next to prev pointer, then prev = current and current = fast. To finally reverse the last 2 elements simply assign curr.next = prev. Lastly, curr pointer will hold head of the reversed list
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;

        while(curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        curr.next = prev; // To reverse the last 2 elements

        return curr;
    }
}