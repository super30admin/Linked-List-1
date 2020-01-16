// Time Complexity : O(n) as we traverse the list once
// Space Complexity : O(1) as we only store 3 pointers at a time
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}