// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 *  We need to reverse the pointers to reverse it. So we take previous node, and swap the pointers
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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
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

    /**
     * Recursive approach - T = O(N) s= O(N)
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)   {
            return head;
        }

        ListNode reversedNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversedNode;
    }
}