package ReverseLL;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/**
 * Approach:
 * This problem is about reversing a singly linked list.
 * I used an iterative approach where I maintained two pointers, pre and head.
 * The pre pointer initially points to null, and the head pointer traverses the list.
 * As I traverse the list, I reverse the direction of each node's next pointer by pointing
 * it to the previous node pre, and then move both pointers forward until the list is fully reversed.
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
class Iterative {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = reverseList(head.next);
        // System.out.println(head.val);
        System.out.println(result.val);

        head.next.next = head;
        head.next = null;

        return result;
    }
}